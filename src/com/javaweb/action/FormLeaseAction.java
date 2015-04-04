package com.javaweb.action;


import java.util.HashMap;

import javax.management.j2ee.statistics.Statistic;

import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Lease;
import com.javaweb.po.LeaseRequest;
import com.javaweb.po.Room;
import com.javaweb.service.FamilyApartmentService;
import com.javaweb.service.GeneralApartmentService;
import com.javaweb.service.LeaseRequestService;
import com.javaweb.service.LeaseService;
import com.javaweb.service.ResidenceHallService;
import com.javaweb.service.RoomService;
import com.opensymphony.xwork2.ActionSupport;

public class FormLeaseAction extends ActionSupport {
	private int id;
	public static final String APARTMENT="apartment";
	public static final String RESIDENCE="residenceHall";
	public static final float MONTH_RATE=300;
	public static final double DEPOSIT=300;
	public static final double PENALTY=300;
	private int house_id;
	private int room_id;
	private String room_num;
	private LeaseRequestService leaseRequestService;
	private LeaseService leaseService;
	private ResidenceHallService residenceHallService;
	private GeneralApartmentService generalApartmentService;
	private FamilyApartmentService familyApartmentService;
	private RoomService roomService;

	public void setLeaseRequestService(LeaseRequestService leaseRequestService) {
		this.leaseRequestService = leaseRequestService;
	}

	public void setLeaseService(LeaseService leaseService) {
		this.leaseService = leaseService;
	}

	public void setResidenceHallService(ResidenceHallService residenceHallService) {
		this.residenceHallService = residenceHallService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	public void setGeneralApartmentService(
			GeneralApartmentService generalApartmentService) {
		this.generalApartmentService = generalApartmentService;
	}

	public void setFamilyApartmentService(
			FamilyApartmentService familyApartmentService) {
		this.familyApartmentService = familyApartmentService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public Object checkHouse(String prefer) {
		if (!prefer.equalsIgnoreCase(APARTMENT) && !prefer.equalsIgnoreCase(RESIDENCE)) {
			int houseId=residenceHallService.queryAvailableHallbyName(prefer);
			if (houseId!=-1) {
				house_id=houseId;
				return residenceHallService.queryResidenceHallByID(houseId);
			}
		}
		else if (prefer.equalsIgnoreCase(APARTMENT)) {
			int houseId= generalApartmentService.queryAvailableApartments();
			if (houseId!=-1) {
				house_id=houseId;
				return generalApartmentService.queryGeneralApartmentByID(houseId);
			}
		}
		else {
			int houseId= residenceHallService.queryAvailableHall();
			if (houseId!=-1) {
				house_id=houseId;
				return residenceHallService.queryResidenceHallByID(houseId);
			}
		}
		return null;
	}
	public void assignRoom(float monthRate) {
		Room room=new Room();
		room.setHouseId(house_id);
		room.setMonthRate(monthRate);
		room.setRoomNumber(room_num);
		roomService.addRoom(room);
		room_id=room.getId();
	}
	public boolean assignHouse() {
		if (house_id==0 || house_id==-1) {
			return false;
		}
		else {
			room_num="a";
			assignRoom(MONTH_RATE);
			return true;
		}
	}
	public Lease generateLease(LeaseRequest leaseRequest) {
		Lease lease=new Lease();
		lease.setHouseId(house_id);
		lease.setStudentId(leaseRequest.getStudentId());
		lease.setRoomId(room_id);
		lease.setRoomNum(room_num);
		lease.setEnterDate(leaseRequest.getStartDate());
		lease.setLeaveDate(leaseRequest.getEndDate());
		int diffInDays = (int)( (leaseRequest.getEndDate().getTime() - leaseRequest.getStartDate().getTime()) 
                / (1000 * 60 * 60 * 24) );
		lease.setDuration(diffInDays+" Days");
		lease.setDeposit(DEPOSIT);
		lease.setPenalty(PENALTY);
		lease.setPayment(leaseRequest.getPaymentMethod());
		lease.setStatus("Approved");
		leaseService.addLease(lease);
		return lease;
	}
	@Override
	public String execute() throws Exception {
		LeaseRequest leaseRequest=leaseRequestService.queryLeaseRequestByID(id);
		String preference1=leaseRequest.getPreference1();
		String preference2=leaseRequest.getPreference2();
		String preference3=leaseRequest.getPreference3();
		if (checkHouse(preference1)!=null) {
			assignHouse();
		}
		else if (checkHouse(preference2)!=null) {
			assignHouse();
		}
		else if (checkHouse(preference3)!=null) {
			assignHouse();
		}
		else {
			leaseRequest.setStatus("Waiting List");
			leaseRequestService.updateLeaseRequest(leaseRequest);
			return ERROR;
		}
		Lease lease=generateLease(leaseRequest);
		leaseRequest.setStatus("Approved");
		leaseRequestService.updateLeaseRequest(leaseRequest);
		ServletActionContext.getRequest().setAttribute("lease", lease);
		return SUCCESS;
	}

}