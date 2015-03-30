package com.javaweb.po;

import java.util.Date;


public class Ticket extends IdEntity<Ticket> {

	private String type; 
	private int studentId;
	private Date date;
	private String location;
	private String description;
	private String status;
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description=description;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status=status;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
