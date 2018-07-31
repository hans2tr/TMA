package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Book;
import com.model.TypeBook;
import com.service.BookService;
import com.service.TypeBookService;

@Controller
public class MainPageController {
	
	@Autowired
	private TypeBookService typeBookService;
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/home")
	public ModelAndView home() {
		ModelAndView mo = new ModelAndView("mainpage");
		List<TypeBook> typeBookList = typeBookService.getTypeBookList();
		List<Book> bookList = bookService.getBookList();
		mo.addObject("typeBookList",typeBookList);
		mo.addObject("bookList",bookList);
		return mo;
	}
	
}
