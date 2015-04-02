package com.javaweb.po;

import java.util.Date;


public class Lease extends IdEntity<Lease>{
	
	private int studentId;
	private int houseId;
	private int roomId;
	private int parkingId;
	private String roomNum;
	private String duration;
	private Date enterDate;
	private Date leaveDate;
	private String deposit;
	private String payment;
	private String penalty;
	private Date inspectDate;
	private String status;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getParkingId() {
		return parkingId;
	}
	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}

	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setLeaveDate(Date date) {
		this.leaveDate = date;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String d) {
		this.deposit = d;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getPenalty() {
		return this.penalty;
	}
	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	public Date getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}
	public Date getInspectDate() {
		return this.inspectDate;
	}
	public void setInspectDate(Date inspectDate) {
		this.inspectDate = inspectDate;
	}
	public Date getLeaveDate() {
		return leaveDate;
	}

}

