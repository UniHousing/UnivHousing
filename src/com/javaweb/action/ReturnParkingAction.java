package com.javaweb.action;


import com.javaweb.po.ParkingSpot;
import com.javaweb.service.LeaseRequestService;
import com.javaweb.service.ParkingSpotOccupyService;
import com.javaweb.service.ParkingSpotService;
import com.opensymphony.xwork2.ActionSupport;

public class ReturnParkingAction extends ActionSupport{
	private int id;
	private ParkingSpotService parkingSpotService;
	private ParkingSpotOccupyService parkingSpotOccupyService;
	
	


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
		if(parkingSpotOccupyService.deleteParkingSpotOccupy(id)){
			ParkingSpot parkingSpot=parkingSpotService.queryParkingSpotByID(id);
			parkingSpot.setAvailability("yes");
			parkingSpotService.updateParkingSpot(parkingSpot);
			return SUCCESS;
		}else {
			return ERROR;
		}
	}



}