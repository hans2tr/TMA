package com.dao;

import org.hibernate.SessionFactory;

public abstract class AbstractDao {
	
	protected SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
