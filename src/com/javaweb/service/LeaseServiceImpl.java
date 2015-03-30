package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.LeaseDAO;
import com.javaweb.po.Lease;

public class LeaseServiceImpl implements LeaseService {
	private LeaseDAO leaseDAO;

	public void setLeaseDAO(LeaseDAO leaseDAO) {
		this.leaseDAO = leaseDAO;
	}

	// add Student
	@Override
	public boolean addLease(Lease lease) {
		if (leaseDAO.queryByID(Lease.class,lease.getId()) == null) {
			leaseDAO.save(lease);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteLease(int id) {
		if (leaseDAO.queryByID(Lease.class,id) != null) {
			leaseDAO.delete(Lease.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateLease(Lease lease) {
		if (leaseDAO.queryByID(Lease.class,lease.getId()) != null) {
			leaseDAO.update(lease);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllLease() {
		return leaseDAO.queryAll(Lease.class);
	}

	@Override
	public Lease queryLeaseByID(int id) {
		return leaseDAO.queryByID(Lease.class,id);
	}


}
