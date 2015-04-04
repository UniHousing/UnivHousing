package com.javaweb.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.javaweb.service.ParkingRequestService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowParkingReqStatusAction extends ActionSupport{
	private ParkingRequestService parkingRequestService;
	
	public void setParkingRequestService(ParkingRequestService parkingRequestService) {
		this.parkingRequestService = parkingRequestService;
	}

	@Override
	public String execute() throws Exception {
		
		int loginId=(Integer) ActionContext.getContext().getSession().get("login");
		System.out.println("login_id"+loginId);
//		List allticket = ticketService.queryAllTicket();
		List alllease=leaseService.queryLeasebyStudentId(loginId);
		System.out.println("lease");
		ServletActionContext.getRequest().setAttribute("all", alllease);
		return SUCCESS;
		
	}
}
