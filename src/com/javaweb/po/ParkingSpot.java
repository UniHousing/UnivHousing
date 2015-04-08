package com.javaweb.po;

import java.util.Date;

public class ParkingSpot extends IdEntity<ParkingSpot>{
	private int lotId;
	private String classification;
	private float fee;
	private String availability;
	private Date startdDate;
	private Date endDate;
	


	public Date getStartdDate() {
		return startdDate;
	}
	public void setStartdDate(Date startdDate) {
		this.startdDate = startdDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
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
