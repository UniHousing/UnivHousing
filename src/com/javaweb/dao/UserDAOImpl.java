package com.javaweb.dao;

import java.util.List;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.javaweb.po.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	// 添加用户
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	// 删除用户
	public void delete(int id) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(User.class, id));
	}

	//更新用户
	public void update(User user) {
		this.getHibernateTemplate().saveOrUpdate(user);
	}

	//查询所有用户
	public List queryAll() {
		return this.getHibernateTemplate().find("from User");
	}

	//按id查询用户
	public User queryByID(int id) {
		return (User) this.getHibernateTemplate().get(User.class, id);
	}

}
