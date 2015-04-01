package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Lease;

public interface LeaseDAO extends BaseDAO<Lease>{
	public List findLeasebyStudentId(int sid);
}
