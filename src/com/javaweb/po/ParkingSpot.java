package com.javaweb.po;

public class ParkingSpot extends IdEntity<ParkingSpot>{
	private int lotId;
	private String classification;
	private float fee;
	private String availability;
	


	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public int getLotId() {
		return lotId;
	}
	public void setLotId(int lotId) {
		this.lotId = lotId;
	}
	
}
