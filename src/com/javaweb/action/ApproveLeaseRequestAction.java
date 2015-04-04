package com.javaweb.action;

import java.util.ArrayList;
import java.util.List;













import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Invoice;
import com.javaweb.po.Lease;
import com.javaweb.po.LeaseRequest;
import com.javaweb.po.TerminReq;
import com.javaweb.service.FamilyApartmentService;
import com.javaweb.service.GeneralApartmentService;
import com.javaweb.service.InvoiceService;
import com.javaweb.service.LeaseRequestService;
import com.javaweb.service.LeaseService;
import com.javaweb.service.ResidenceHallService;
import com.javaweb.service.TerminReqService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ApproveLeaseRequestAction extends ActionSupport {
	private LeaseRequestService leaseRequestService;
	
	public void setLeaseRequestService(LeaseRequestService leaseRequestService) {
		this.leaseRequestService = leaseRequestService;
	}



	@Override
	public String execute() throws Exception {
		List<LeaseRequest> leaseRequests=leaseRequestService.queryAllLeaseRequest();
		ServletActionContext.getRequest().setAttribute("req", leaseRequests);
		return SUCCESS;
	}

}
