package com.javaweb.po;

public class ParkingRequest extends IdEntity<ParkingRequest>{
	private String vehicleType;
	private String nearby;
	private String handicapped;
	private String status;
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getNearbySpot() {
		return nearby;
	}
	public void setNearbySpot(String nearby) {
		this.nearby = nearby;
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
