package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.User;



public interface UserDAO {
	//添加用户
	public void save(User user);
	
	//删除用户
	public void delete(int id);
	
	//更新用户
	public void update(User user);
	
	//查询所有用户
	public List queryAll();
	
	//按id查询用户
	public User queryByID(int id);
}
