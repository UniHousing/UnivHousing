package com.javaweb.action;


import com.javaweb.po.ParkingRequest;
import com.javaweb.service.ParkingRequestService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddParkingRequestAction extends ActionSupport{

	private String status;
	private String nearby;
	private String classification1;
	



	public ParkingRequestService getParkingRequestService() {
		return parkingRequestService;
	}




	private ParkingRequestService parkingRequestService;

	public void setParkingRequestService(ParkingRequestService parkingRequestService) {
		this.parkingRequestService = parkingRequestService;
	}
	
	public AddParkingRequestAction() {
		// TODO Auto-generated constructor stub
		
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


	public String getClassfication() {
		return classification1;
	}

	public void setClassfication(String classification) {
		this.classification1 = classification;
	}

	@Override
	public String execute() throws Exception {
		ParkingRequest parkingRequest=new ParkingRequest();
		int user_id=(Integer) ActionContext.getContext().getSession().get("login");
		String type=(String) ActionContext.getContext().getSession().get("type");
		parkingRequest.setStudentId(user_id);
		
		parkingRequest.setClassification(classification1);
		System.out.println(classification1);
		
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