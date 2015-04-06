package com.javaweb.action;


import com.javaweb.po.ParkingRequest;
import com.javaweb.service.ParkingRequestService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddParkingRequestAction extends ActionSupport{
	private String vehicleType;
	private String handicapped;
	private String status;
	private String nearby;
	

	private ParkingRequestService parkingRequestService;

	public void setParkingRequestService(ParkingRequestService parkingRequestService) {
		this.parkingRequestService = parkingRequestService;
	}
	
	public AddParkingRequestAction() {
		// TODO Auto-generated constructor stub
		
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getHandicapped() {
		return handicapped;
	}


	public void setHandicapped(String handicapped) {
		this.handicapped = handicapped;
	}


	public String getNearby() {
		return nearby;
	}


	public void setNearby(String nearby) {
		this.nearby = nearby;
	}

	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	

	@Override
	public String execute() throws Exception {
		ParkingRequest parkingRequest=new ParkingRequest();
		int user_id=(Integer) ActionContext.getContext().getSession().get("login");
		String type=(String) ActionContext.getContext().getSession().get("type");
		parkingRequest.setStudentId(user_id);
		parkingRequest.setVehicleType(vehicleType);
		if(type.equals("student"))
			parkingRequest.setHandicapped(handicapped);
		else
			parkingRequest.setHandicapped("no");
		parkingRequest.setNearby(nearby);
		
		parkingRequest.setStatus("Pending");

		if(parkingRequestService.addParkingRequest(parkingRequest)){
			return SUCCESS; 
		}
		else{
			addActionError("error!");
			return ERROR;
		}
		
	}

	
}