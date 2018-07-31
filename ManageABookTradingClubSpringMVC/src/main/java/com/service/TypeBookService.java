package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TypeBookDao;
import com.model.TypeBook;

@Service
@Transactional
public class TypeBookService {

	private TypeBookDao typeBookDao;

	@Autowired
	public void setTypeBookDao(TypeBookDao typeBookDao) {
		this.typeBookDao = typeBookDao;
	}

	public List<TypeBook> getTypeBookList() {
		return typeBookDao.getTypeBookList();
	}

	public TypeBook getTypeByName(String name) {
		return typeBookDao.getTypeByName(name);
	}

	public void addType(TypeBook typeBook) {
		typeBookDao.addType(typeBook);
	}
}
