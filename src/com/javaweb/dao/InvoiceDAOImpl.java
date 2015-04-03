package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Invoice;

public class InvoiceDAOImpl extends BaseDAOImpl<Invoice>implements InvoiceDAO {
	@Override
	public List findRequestbyLeaseId(int lid) {
		// TODO Auto-generated method stub
		return queryByForeignId(Invoice.class, "leaseId", lid);
	}
	

}
