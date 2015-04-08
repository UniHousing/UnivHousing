package com.javaweb.dao;

import java.util.List;


import com.javaweb.po.ParkingSpotPrice;



public class ParkingSpotPriceDAOImpl extends BaseDAOImpl<ParkingSpotPrice> implements ParkingSpotPriceDAO{
	
	public float findPricebySpotClassification(String classification){
		List<ParkingSpotPrice> parkingSpotPrice=this.queryByAttribute(ParkingSpotPrice.class, "classification", classification);
		
		if(parkingSpotPrice!=null){
			for (ParkingSpotPrice element : parkingSpotPrice) // or sArray
	        {
	               return element.getPrice();   	
	        }
		}
		
		return 0;
	}
	

}
