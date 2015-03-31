package com.javaweb.dao;

import java.util.List;


public interface BaseDAO<T> {
	public void save(T t);

	public void delete(Class<?> clazz,int id);

	public void update(T t);
	
	public List queryAll(Class<?> clazz);
	
	public T queryByID(Class<?> clazz,int id);
	
	public List queryByForeignId(Class<?> clazz, String columnName,int fid);
	
	public List queryByAttribute(Class<?> clazz,String columnName,String str);
}
