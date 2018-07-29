package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;

public interface Dao {
	
	public void setSessionFactory(SessionFactory sessionFactory);

	public List<Object> getList();
	
	
	
}
