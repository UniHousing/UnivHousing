package com.javaweb.dao;

import com.javaweb.po.ParkingSpotPrice;



public interface ParkingSpotPriceDAO extends BaseDAO<ParkingSpotPrice> {
	public int findPricebySpotClassification(String classification);
}
