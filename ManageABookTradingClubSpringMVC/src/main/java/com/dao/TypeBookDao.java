package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.model.TypeBook;

@Repository
public class TypeBookDao extends AbstractDao {

	@SuppressWarnings("unchecked")
	public List<TypeBook> getTypeBookList() {
		Session session = this.sessionFactory.getCurrentSession();
		List<TypeBook> typeBookList = session.createQuery("from TypeBook").list();
		return typeBookList;
	}

	@SuppressWarnings("unchecked")
	public TypeBook getTypeByName(String name) {
		Session session = this.sessionFactory.getCurrentSession();
		List<TypeBook> typeBookList = session.createQuery("from TypeBook t where t.name='" + name + "'").list();
		if (typeBookList.size() > 0) {
			return typeBookList.get(0);
		}
		return null;
	}
	
	public void addType(TypeBook typeBook) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(typeBook);
	}
}
