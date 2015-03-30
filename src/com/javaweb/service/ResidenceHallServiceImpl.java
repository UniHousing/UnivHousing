package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.ResidenceHallDAO;
import com.javaweb.po.ResidenceHall;

public class ResidenceHallServiceImpl implements ResidenceHallService{
	private ResidenceHallDAO residenceHallDAO;

	public void setResidenceHallDAO(ResidenceHallDAO residenceHallDAO) {
		this.residenceHallDAO = residenceHallDAO;
	}

	// add ResidenceHall
	@Override
	public boolean addResidenceHall(ResidenceHall entity) {
		if (residenceHallDAO.queryByID(ResidenceHall.class,entity.getId()) == null) {
			residenceHallDAO.save(entity);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteResidenceHall(int id) {
		if (residenceHallDAO.queryByID(ResidenceHall.class,id) != null) {
			residenceHallDAO.delete(ResidenceHall.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateResidenceHall(ResidenceHall entity) {
		if (residenceHallDAO.queryByID(ResidenceHall.class,entity.getId()) != null) {
			residenceHallDAO.update(entity);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllResidenceHall() {
		return residenceHallDAO.queryAll(ResidenceHall.class);
	}

	@Override
	public ResidenceHall queryResidenceHallByID(int id) {
		return residenceHallDAO.queryByID(ResidenceHall.class,id);
	}

}
