package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.RoomDAO;
import com.javaweb.po.Room;

public class StaffServiceImpl implements RoomService {
	private RoomDAO roomDAO;

	public void setRoomDAO(RoomDAO roomDAO) {
		this.roomDAO = roomDAO;
	}

	// add Room
	@Override
	public boolean addRoom(Room room) {
		if (roomDAO.queryByID(Room.class,room.getId()) == null) {
			roomDAO.save(room);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteRoom(int id) {
		if (roomDAO.queryByID(Room.class,id) != null) {
			roomDAO.delete(Room.class,id);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public boolean updateRoom(Room room) {
		if (roomDAO.queryByID(Room.class,room.getId()) != null) {
			roomDAO.update(room);
		} else {
			return false;
		}
		return true;
	}

	@Override
	public List queryAllRoom() {
		return roomDAO.queryAll(Room.class);
	}

	@Override
	public Room queryRoomByID(int id) {
		return roomDAO.queryByID(Room.class,id);
	}


}
