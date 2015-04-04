package com.javaweb.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.javaweb.service.ParkingLotService;
import com.javaweb.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowCurrentParkingLotAction extends ActionSupport {
	private ParkingLotService parkingLotService;
	

	
	public void setParkingLotService(ParkingLotService parkingLotService) {
		this.parkingLotService = parkingLotService;
	}


	@Override
	public String execute() throws Exception {
		List all = parkingLotService.queryAllParkingLot();
		ServletActionContext.getRequest().setAttribute("all", all);
		
		return SUCCESS;
	}

}
