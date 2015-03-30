package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.ParkingLotDAO;
import com.javaweb.po.ParkingLot;

public class ParkingLotServiceImpl implements ParkingLotService {
	private ParkingLotDAO parkingLotDAO;

	public void setParkingLotDAO(ParkingLotDAO parkingLotDAO) {
		this.parkingLotDAO = parkingLotDAO;
	}

	// add Student
	@Override
	public boolean addParkingLot(ParkingLot parkingLot) {
		if (parkingLotDAO.queryByID(ParkingLot.class,parkingLot.getId()) == null) {
			parkingLotDAO.save(parkingLot);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteParkingLot(int id) {
		if (parkingLotDAO.queryByID(ParkingLot.class,id) != null) {
			parkingLotDAO.delete(ParkingLot.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateParkingLot(ParkingLot parkingLot) {
		if (parkingLotDAO.queryByID(ParkingLot.class,parkingLot.getId()) != null) {
			parkingLotDAO.update(parkingLot);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllParkingLot() {
		return parkingLotDAO.queryAll(ParkingLot.class);
	}

	@Override
	public ParkingLot queryParkingLotByID(int id) {
		return parkingLotDAO.queryByID(ParkingLot.class,id);
	}


}
