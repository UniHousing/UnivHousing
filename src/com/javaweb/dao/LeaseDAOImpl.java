package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Lease;

public class LeaseDAOImpl extends BaseDAOImpl<Lease>implements LeaseDAO {

	@Override
	public List findLeasebyStudentId(int sid) {
		// TODO Auto-generated method stub
		return queryByForeignId(Lease.class, "studentId", sid);
	}

	

}
