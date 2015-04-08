package com.javaweb.action;


import org.apache.struts2.ServletActionContext;

import com.javaweb.po.FamilyApartment;
import com.javaweb.po.GeneralApartment;
import com.javaweb.po.Lease;
import com.javaweb.po.LeaseRequest;
import com.javaweb.po.ResidenceHall;
import com.javaweb.po.Room;
import com.javaweb.service.FamilyApartmentService;
import com.javaweb.service.GeneralApartmentService;
import com.javaweb.service.LeaseRequestService;
import com.javaweb.service.LeaseService;
import com.javaweb.service.ResidenceHallService;
import com.javaweb.service.RoomService;
import com.javaweb.service.StudentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FormLeaseAction extends ActionSupport {
	private int id;
	public static final String APARTMENT="apartment";
	public static final String RESIDENCE="residenceHall";
	public static final String FAMILY="family apartment";
	public static final String OFFCAMPUS="off campus";
	public static  float MONTH_RATE;
	public static  double DEPOSIT;
	public static  double PENALTY=50;
	private int house_id=0;
	private int room_id;
	private String room_num;
	private int level=0;
	private LeaseRequestService leaseRequestService;
	private LeaseService leaseService;
	private StudentService studentService;
	private ResidenceHallService residenceHallService;
	private GeneralApartmentService generalApartmentService;
	private FamilyApartmentService familyApartmentService;
	private RoomService roomService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

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
			int houseId;
			if (level==10) {
				houseId=residenceHallService.queryAvailableHallbyName(prefer);
			}
			else {
				houseId=residenceHallService.queryGeneralHallbyName(prefer);
			}
			
			if (houseId!=-1) {
				house_id=houseId;
				ResidenceHall residenceHall=residenceHallService.queryResidenceHallByID(houseId);
				MONTH_RATE=residenceHall.getRent();
				DEPOSIT=residenceHall.getDeposit();
				return residenceHall;
			}
		}
		else if (prefer.equalsIgnoreCase(APARTMENT)) {
			int houseId= generalApartmentService.queryAvailableApartments();
			if (houseId!=-1) {
				house_id=houseId;
				GeneralApartment generalApartment=generalApartmentService.queryGeneralApartmentByID(houseId);
				MONTH_RATE=generalApartment.getRent();
				DEPOSIT=generalApartment.getDeposit();
				return generalApartment;
			}
		}
		else if (prefer.equalsIgnoreCase(FAMILY)) {
			int houseId=familyApartmentService.queryAvailableApartments();
			if (houseId!=-1) {
				house_id=houseId;
				FamilyApartment familyApartment=familyApartmentService.queryFamilyApartmentByID(houseId);
				MONTH_RATE=familyApartment.getMonthRate();
				DEPOSIT=familyApartment.getDeposit();
				return familyApartment;
			}
		}
		else {
			int houseId;
			if (level==10) {
				houseId= residenceHallService.queryAvailableHall();
			}
			else {
				houseId=residenceHallService.queryGeneralHall();
			}
			if (houseId!=-1) {
				house_id=houseId;
				ResidenceHall residenceHall=residenceHallService.queryResidenceHallByID(houseId);
				MONTH_RATE=residenceHall.getRent();
				DEPOSIT=residenceHall.getDeposit();
				return residenceHall;
			}
		}
		return null;
	}
	public void assignRoom() {
		Room room=roomService.queryRoomInHouse(house_id);
		room_id=room.getId();
		room_num=room.getRoomNumber();
		room.setVacancy(1);
		roomService.updateRoom(room);
	}
	public boolean assignHouse() {
		if (house_id==0 || house_id==-1) {
			return false;
		}
		else {
			assignRoom();
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
		String category=studentService.queryStudentByID(leaseRequest.getStudentId()).getCategory();
		if (category.equalsIgnoreCase("graduate")) {
			level=10;
		}
		if (preference1.equalsIgnoreCase(OFFCAMPUS)) {
			leaseRequest.setStatus("Approved");
			leaseRequestService.updateLeaseRequest(leaseRequest);
			return ERROR;
		}
		else if (checkHouse(preference1)!=null) {
			assignHouse();
		}
		else if (preference2.equalsIgnoreCase(OFFCAMPUS)) {
			leaseRequest.setStatus("Approved");
			leaseRequestService.updateLeaseRequest(leaseRequest);
			return ERROR;
		}
		else if (checkHouse(preference2)!=null) {
			assignHouse();
		}
		else if (preference3.equalsIgnoreCase(OFFCAMPUS)) {
			leaseRequest.setStatus("Approved");
			leaseRequestService.updateLeaseRequest(leaseRequest);
			return ERROR;
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