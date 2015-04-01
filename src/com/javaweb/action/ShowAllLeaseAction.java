package com.javaweb.action;

import java.util.List;


import org.apache.struts2.ServletActionContext;

import com.javaweb.service.LeaseService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllLeaseAction extends ActionSupport {
	private LeaseService leaseService;

	public void setLeaseService(LeaseService leaseService) {
		this.leaseService = leaseService;
	}

	@Override
	public String execute() throws Exception {
		List all = leaseService.queryAllLease();
		ServletActionContext.getRequest().setAttribute("all", all);
		return SUCCESS;
	}

}
