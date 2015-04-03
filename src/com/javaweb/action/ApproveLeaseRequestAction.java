package com.javaweb.action;

import java.util.ArrayList;
import java.util.List;










import org.apache.struts2.ServletActionContext;

import com.javaweb.po.Invoice;
import com.javaweb.po.Lease;
import com.javaweb.po.LeaseRequest;
import com.javaweb.po.TerminReq;
import com.javaweb.service.InvoiceService;
import com.javaweb.service.LeaseRequestService;
import com.javaweb.service.LeaseService;
import com.javaweb.service.TerminReqService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ApproveLeaseRequestAction extends ActionSupport {
	private LeaseRequestService leaseRequestService;
	private LeaseService leaseService;

	
	public void setLeaseService(LeaseService leaseService) {
		this.leaseService = leaseService;
	}

	public void setLeaseRequestService(LeaseRequestService leaseRequestService) {
		this.leaseRequestService = leaseRequestService;
	}



	@Override
	public String execute() throws Exception {
		int user_id=(Integer) ActionContext.getContext().getSession().get("login");
		List<LeaseRequest> leaseRequests=leaseRequestService.queryLeaseRequestByStudentId(user_id);
		List<Lease> leases=leaseService.queryLeasebyStudentId(user_id);

		ServletActionContext.getRequest().setAttribute("req", leaseRequests);
		return SUCCESS;
	}

}
