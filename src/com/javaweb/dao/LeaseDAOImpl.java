package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Lease;


public class LeaseDAOImpl extends BaseDAOImpl<Lease>implements LeaseDAO {

	@Override
	public List<Lease> findLeasebyStudentId(int sid) {
		// TODO Auto-generated method stub
		return this.queryByForeignId(Lease.class, "studentId", sid);
	}
	// save

	
	public int findCurrentIdbyStudentId(int sid){
		
		List<Lease> leases=this.queryByForeignId(Lease.class, "studentId", sid);
		if(leases!=null){
			for (Lease element : leases) // or sArray
	        {
	               if(element.getStatus().equals("current"))
	               	return element.getId();    	
	        }
		}
		
		return -1;
	}
		

}
