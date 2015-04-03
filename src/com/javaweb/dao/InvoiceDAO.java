package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Invoice;
import com.javaweb.po.Lease;

public interface InvoiceDAO extends BaseDAO<Invoice>{
	public List findRequestbyLeaseId(int lid);
	public List<Invoice> findCInvoicesbyLeaseId(int lid);
	public List<Invoice> findFInvoicesbyLeaseId(int lid);
}
