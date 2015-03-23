package com.javaweb.dao;

import java.util.List;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.javaweb.po.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	// save
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	// delete
	public void delete(int id) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(User.class, id));
	}

	//update
	public void update(User user) {
		this.getHibernateTemplate().saveOrUpdate(user);
	}

	//findAll
	public List queryAll() {
		return this.getHibernateTemplate().find("from User");
	}

	//find By Id
	public User queryByID(int id) {
		return (User) this.getHibernateTemplate().get(User.class, id);
	}

}
