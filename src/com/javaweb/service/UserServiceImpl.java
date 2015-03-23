package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.UserDAO;
import com.javaweb.po.User;


public class UserServiceImpl implements UserService{
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	// add User
	public boolean addUser(User user) {
		if (userDAO.queryByID(user.getId()) == null) {
			userDAO.save(user);
		} else {
			return false;
		}
		return true;
	}

	public boolean deleteUser(int id) {
		if (userDAO.queryByID(id) != null) {
			userDAO.delete(id);
		} else {
			return false;
		}
		return true;
	}

	public boolean updateUser(User user) {
		if (userDAO.queryByID(user.getId()) != null) {
			userDAO.update(user);
		} else {
			return false;
		}
		return true;
	}

	public List queryAllUser() {
		return userDAO.queryAll();
	}

	public User queryUserByID(int id) {
		return userDAO.queryByID(id);
	}


}
