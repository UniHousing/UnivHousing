package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Invoice;
import com.javaweb.po.ParkingSpotOccupy;



public interface ParkingSpotOccupyDAO extends BaseDAO<ParkingSpotOccupy> {
	public int findStudentIdbySpotId(int pid);
	public int findSpotIdbyStudentId(int sid);
}
