package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookDao;
import com.model.Book;
@Service
@Transactional
public class BookService {
	
	private BookDao bookDao;
	@Autowired
	public void setBookDao (BookDao bookDao) {
		this.bookDao = bookDao;
	}

	public List<Book> getBookList(){
		return bookDao.getBookList();
	}

	public void addBook(Book book) {
		bookDao.addBook(book);
	}
}
