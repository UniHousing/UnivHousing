package com.javaweb.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.javaweb.po.ParkingLot;
import com.javaweb.po.ParkingSpot;
import com.javaweb.po.ParkingSpotOccupy;
import com.javaweb.service.ParkingLotService;
import com.javaweb.service.ParkingSpotOccupyService;
import com.javaweb.service.ParkingSpotService;
import com.javaweb.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowCurrentParkingLotAction extends ActionSupport {
	private ParkingLotService parkingLotService;
    private ParkingSpotOccupyService parkingSpotOccupyService;
    private ParkingSpotService parkingSpotService;
	
	public void setParkingSpotOccupyService(
			ParkingSpotOccupyService parkingSpotOccupyService) {
		this.parkingSpotOccupyService = parkingSpotOccupyService;
	}


	public void setParkingLotService(ParkingLotService parkingLotService) {
		this.parkingLotService = parkingLotService;
	}


	@Override
	public String execute() throws Exception {
		int user_id=(Integer) ActionContext.getContext().getSession().get("login");
		int spot_id=parkingSpotOccupyService.findSpotIdbyStudentId(user_id);
		int lot_id=parkingSpotService.queryParkingSpotByID(spot_id).getLotId();
		ParkingLot parkingLot=parkingLotService.queryParkingLotByID(lot_id);
		ServletActionContext.getRequest().setAttribute("lot", parkingLot);
		
		return SUCCESS;
	}

}
