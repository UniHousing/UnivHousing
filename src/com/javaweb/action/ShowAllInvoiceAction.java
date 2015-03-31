package com.javaweb.action;

import java.util.List;


import org.apache.struts2.ServletActionContext;

import com.javaweb.service.InvoiceService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllInvoiceAction extends ActionSupport {
	private InvoiceService invoiceService;

	public void setInvoiceService(InvoiceService invoiceService) {
		this.invoiceService = invoiceService;
	}

	@Override
	public String execute() throws Exception {
		List all = invoiceService.queryAllInvoice();
		ServletActionContext.getRequest().setAttribute("all", all);
		return SUCCESS;
	}

}
