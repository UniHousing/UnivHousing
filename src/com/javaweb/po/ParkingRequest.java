package com.javaweb.po;

public class ParkingRequest extends IdEntity<ParkingRequest>{
	private String vehicleType;
	
	private String handicapped;
	private String status;
	private String nearbyt;
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getNearbyt() {
		return nearbyt;
	}
	public void setNearbyt(String nearbyt) {
		this.nearbyt = nearbyt;
	}
	public String getHandicapped() {
		return handicapped;
	}
	public void setHandicapped(String handicapped) {
		this.handicapped = handicapped;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
