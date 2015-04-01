package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Invoice;
import com.javaweb.po.LeaseRequest;

public class InvoiceDAOImpl extends BaseDAOImpl<Invoice>implements InvoiceDAO {
	@Override
	public List findRequestbyLeaseId(int lid) {
		// TODO Auto-generated method stub
		return queryByForeignId(Invoice.class, "leaseId", lid);
	}
	

}
