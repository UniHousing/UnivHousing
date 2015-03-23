package com.javaweb.service;

import java.util.List;

import com.javaweb.po.User;


public interface UserService {
	//添加用户
	public boolean addUser(User user);
	
	//删除用户
	public boolean deleteUser(int id);
	
	//更新用户
	public boolean updateUser(User user);
	
	//查询所有用户
	public List queryAllUser();
	
	//按id查询用户
	public User queryUserByID(int id);
}
