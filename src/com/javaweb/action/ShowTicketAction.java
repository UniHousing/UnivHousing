package com.javaweb.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.javaweb.service.TicketService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowTicketAction extends ActionSupport{
	private TicketService ticketService;

	
	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	public String execute() throws Exception {

		List allticket = ticketService.queryAllTicket();
	
		ServletActionContext.getRequest().setAttribute("all", allticket);
		return SUCCESS;
		
	}
}
