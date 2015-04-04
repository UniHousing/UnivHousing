package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.ResidenceHallDAO;
import com.javaweb.po.ResidenceHall;

public class ResidenceHallServiceImpl implements ResidenceHallService{
	private ResidenceHallDAO residenceHallDAO;
	private RoomService roomService;
	public void setResidenceHallDAO(ResidenceHallDAO residenceHallDAO) {
		this.residenceHallDAO = residenceHallDAO;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
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

	@Override
	public int queryAvailableHallbyName(String name) {
		// TODO Auto-generated method stub
		List<ResidenceHall> halls=residenceHallDAO.findHallsbyName(name);
		if (halls==null) {
			return -1;
		}
		else {
			for (ResidenceHall residenceHall : halls) {
				if (residenceHall.getRoomCount()>roomService.queryRoomsInHouse(residenceHall.getId())) {
					return residenceHall.getId();
				}
			}
			return -1;
		}
	}

	@Override
	public int queryAvailableHall() {
		// TODO Auto-generated method stub
		List<ResidenceHall> halls=this.queryAllResidenceHall();
		if (halls==null) {
			return -1;
		}
		else {
			for (ResidenceHall residenceHall : halls) {
				if (residenceHall.getRoomCount()>roomService.queryRoomsInHouse(residenceHall.getId())) {
					return residenceHall.getId();
				}
			}
			return -1;
		}
	}

}
