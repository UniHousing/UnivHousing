package com.javaweb.po;


public class ParkingLot extends IdEntity<ParkingLot>{
	
	private int numParkingSpot;
	
	public int getNumParkingSpot() {
		return numParkingSpot;
	}

	public void setNumParkingSpot(int numParkingLot) {
		this.numParkingSpot = numParkingLot;
	}
}
