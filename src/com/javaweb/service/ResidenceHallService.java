package com.javaweb.service;

import java.util.List;

import com.javaweb.po.ResidenceHall;

public interface ResidenceHallService {
public boolean addResidenceHall(ResidenceHall residenceHall);
	
	public boolean deleteResidenceHall(int id);
	
	public boolean updateResidenceHall(ResidenceHall residenceHall);
	
	public List queryAllResidenceHall();
	
	public ResidenceHall queryResidenceHallByID(int id);
}
