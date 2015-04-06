package com.javaweb.po;

public class ParkingSpotPrice extends IdEntity<ParkingSpotPrice> {
	private String classification;
	private int price;
	
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
