package com.javaweb.dao;

import java.util.List;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class BaseDAOImpl<T> extends HibernateDaoSupport implements BaseDAO<T> {

	@Override
	public void save(T t) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(t);
	}

	@Override
	public void delete(Class<?> clazz,int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.getHibernateTemplate().get(clazz, id));
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(t);
	}

	@Override
	public List queryAll(Class<?> clazz) {
		// TODO Auto-generated method stub
		System.out.println(clazz.getSimpleName());
		return this.getHibernateTemplate().find("from "+ (clazz.getSimpleName()));
	}

	@Override
	public T queryByID(Class<?> clazz,int id) {
		// TODO Auto-generated method stub
		return (T) this.getHibernateTemplate().get(clazz, id);
	}
	private String toUnderScore(String className){
    	String regex="([a-z])([A-Z]+)";
		String replacement="$1_$2";
		return className.replaceAll(regex, replacement).toLowerCase();
    }

	@Override
	public List queryByForeignId(Class<?> clazz, String columnName,int fid) {
		// TODO Auto-generated method stub
		Criterion fidEqualCriterion=Restrictions.eq(columnName, fid);
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(clazz);
		detachedCriteria.add(fidEqualCriterion);
		return this.getHibernateTemplate().findByCriteria(detachedCriteria);
	}

	@Override
	public List queryByAttribute(Class<?> clazz, String columnName, String str) {
		// TODO Auto-generated method stub
		Criterion attributeLikeCriterion=Restrictions.like(columnName, "%"+str+"%").ignoreCase();
		DetachedCriteria detachedCriteria=DetachedCriteria.forClass(clazz);
		detachedCriteria.add(attributeLikeCriterion);
		return this.getHibernateTemplate().findByCriteria(detachedCriteria);
	}

}
