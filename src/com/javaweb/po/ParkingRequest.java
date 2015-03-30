package com.javaweb.po;

public class ParkingRequest extends IdEntity<ParkingRequest>{
	private String vehicleType;
	
	private String handicapped;
	private String status;
	private String nearby;
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
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
	public String getNearby() {
		return nearby;
	}
	public void setNearby(String nearby) {
		this.nearby = nearby;
	}
	
}
