package com.javaweb.action;


import java.util.Date;

import com.javaweb.po.ParkingSpot;
import com.javaweb.po.ParkingSpotOccupy;
import com.javaweb.service.LeaseRequestService;
import com.javaweb.service.LeaseService;
import com.javaweb.service.ParkingSpotOccupyService;
import com.javaweb.service.ParkingSpotService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RenewParkingAction extends ActionSupport{
	private int id;
	private ParkingSpotService parkingSpotService;
	private ParkingSpotOccupyService parkingSpotOccupyService;
	private LeaseService leaseService;
	


	public void setLeaseService(LeaseService leaseService) {
		this.leaseService = leaseService;
	}

	public void setParkingSpotService(ParkingSpotService parkingSpotService) {
		this.parkingSpotService = parkingSpotService;
	}

	public void setParkingSpotOccupyService(
			ParkingSpotOccupyService parkingSpotOccupyService) {
		this.parkingSpotOccupyService = parkingSpotOccupyService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String execute() throws Exception {
		int user_id=(Integer) ActionContext.getContext().getSession().get("login");
		ParkingSpotOccupy parkingOccupy=parkingSpotOccupyService.queryParkingSpotOccupyByID(id);
		if (parkingOccupy==null) {
			return ERROR;
		}
		if(parkingOccupy.getStudentId()==user_id){
			ParkingSpot parkingSpot=parkingSpotService.queryParkingSpotByID(parkingOccupy.getParkingSpotId());
			Date newEndDate=parkingSpot.getEndDate();
			newEndDate.setMonth(newEndDate.getMonth()+1);
			parkingSpot.setEndDate(newEndDate);
			parkingSpotService.updateParkingSpot(parkingSpot);
			return SUCCESS;
		}else {
			return ERROR;
		}
	}



}