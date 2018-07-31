package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.model.Book;

@Repository
public class BookDao extends AbstractDao{
	
	
	@SuppressWarnings("unchecked")
	public List<Book> getBookList(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Book> bookList = session.createQuery("from Book").list();
		return bookList;
	}
	public void addBook(Book book) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(book);
	}
}
