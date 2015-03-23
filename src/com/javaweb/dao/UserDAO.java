package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.User;



public interface UserDAO {
	public void save(User user);

	public void delete(int id);

	public void update(User user);
	
	public List queryAll();
	
	public User queryByID(int id);
}
