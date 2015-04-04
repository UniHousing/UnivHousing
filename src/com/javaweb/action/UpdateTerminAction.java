package com.javaweb.action;

import java.util.Date;

import com.javaweb.po.TerminReq;
import com.javaweb.service.LeaseService;
import com.javaweb.service.TerminReqService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateTerminAction extends ActionSupport{
	
	private int extraFee;
	private Date inspectionDate;
	private String status;
	private TerminReqService terminReqService;
	private LeaseService leaseService;
	public int getExtraFee() {
		return extraFee;
	}




	public void setExtraFee(int extraFee) {
		this.extraFee = extraFee;
	}




	public Date getInspectionDate() {
		return inspectionDate;
	}




	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public void setTerminReqService(TerminReqService terminReqService) {
		this.terminReqService = terminReqService;
	}




	@Override
	public String execute() throws Exception {
		System.out.println(ActionContext.getContext().getParameters());
		int req_id=Integer.parseInt(ActionContext.getContext().getSession().get("req_id").toString());
		TerminReq terminReq=terminReqService.queryTerminReqByID(req_id);
		terminReq.setExtraFee(extraFee);
		terminReq.setInspectionDate(inspectionDate);
		terminReq.setStatus("Approved");
		if(terminReqService.updateTerminReq(terminReq)){
			return SUCCESS;
		}else {
			return ERROR;
		}
	}



	public void setLeaseService(LeaseService leaseService) {
		this.leaseService = leaseService;
	}
	
}