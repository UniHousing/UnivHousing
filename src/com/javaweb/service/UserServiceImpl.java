package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.UserDAO;
import com.javaweb.po.User;


public class UserServiceImpl implements UserService{
	//DAO组件引用
	private UserDAO userDAO;

	//设置DAO组件
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	// 添加用户
	public boolean addUser(User user) {
		//判断是否存在相同ID的用户
		if (userDAO.queryByID(user.getId()) == null) {
			//如果不存在，而调用DAO组件进行保存
			userDAO.save(user);
		} else {
			return false;
		}
		return true;
	}

	// 删除用户
	public boolean deleteUser(int id) {
		//判断是否存在相同ID的用户
		if (userDAO.queryByID(id) != null) {
			//如果存在，而调用DAO组件进行删除
			userDAO.delete(id);
		} else {
			return false;
		}
		return true;
	}

	// 更新用户
	public boolean updateUser(User user) {
		//判断是否存在相同ID的用户
		if (userDAO.queryByID(user.getId()) != null) {
			//如果存在，而调用DAO组件进行更新
			userDAO.update(user);
		} else {
			return false;
		}
		return true;
	}

	// 查询所有用户
	public List queryAllUser() {
		//调用DAO组件进行查询
		return userDAO.queryAll();
	}

	// 按id查询用户
	public User queryUserByID(int id) {
		//调用DAO组件进行查询
		return userDAO.queryByID(id);
	}


}
