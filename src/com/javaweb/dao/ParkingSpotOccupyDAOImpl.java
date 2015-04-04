package com.javaweb.dao;

import java.util.ArrayList;
import java.util.List;


import com.javaweb.po.ParkingSpotOccupy;



public class ParkingSpotOccupyDAOImpl extends BaseDAOImpl<ParkingSpotOccupy> implements ParkingSpotOccupyDAO{
	
	public int findStudentIdbySpotId(int pid){
		List<ParkingSpotOccupy> parkingSpotOccupy=this.queryByForeignId(ParkingSpotOccupy.class, "parkingSpotId", pid);
		
		if(parkingSpotOccupy!=null){
			for (ParkingSpotOccupy element : parkingSpotOccupy) // or sArray
	        {
	               return element.getStudentId();   	
	        }
		}
		
		return -1;
		
	
	}
	
	public int findSpotIdbyStudentId(int sid){
		List<ParkingSpotOccupy> parkingSpotOccupy=this.queryByForeignId(ParkingSpotOccupy.class, "studentId", sid);
		
		if(parkingSpotOccupy!=null){
			for (ParkingSpotOccupy element : parkingSpotOccupy) // or sArray
	        {
	               return element.getParkingSpotId();   	
	        }
		}
		return -1;
		
	}
}
