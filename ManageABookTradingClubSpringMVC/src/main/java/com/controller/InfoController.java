package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AccountDao;
import com.dao.BookDao;
import com.dao.TypeBookDao;
import com.dao.UserInfoDao;
import com.model.Account;
import com.model.Book;
import com.model.TypeBook;
import com.model.UserInfo;
import com.service.AccountService;
import com.service.BookService;
import com.service.TypeBookService;
import com.service.UserInfoService;

@Controller
public class InfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Autowired
	private TypeBookService typeBookService;
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private AccountService accountService;
	

	@RequestMapping(value = "/infoForm")
	public ModelAndView infoPage(HttpSession session) {
		ModelAndView mo = new ModelAndView("informationform");
		
		String name = (String) session.getAttribute("username");
		UserInfo userInfo = userInfoService.getInfoByUsername(name);
		
		List<TypeBook> typeList = typeBookService.getTypeBookList();
		mo.addObject("userInfo", userInfo);
		mo.addObject("typeList", typeList);
		return mo;
	}

	@RequestMapping(value = "/addBook")
	public ModelAndView addBook(@RequestParam("nameBook") String nameBook, @RequestParam("typeBook") String typeBook,
			@RequestParam("typeBookIn") String typeBookIn, HttpSession session) {
		TypeBook type = new TypeBook();
		Book book = new Book();
		if (typeBook.equals("Other")) {
			type.setName(typeBookIn);
			typeBookService.addType(type);
		} else {
			type = typeBookService.getTypeByName(typeBook);
		}
		String name = (String) session.getAttribute("username");
		UserInfo userInfo = userInfoService.getInfoByUsername(name);
		book.setName(nameBook);
		book.setType(type);
		book.setUserInfo(userInfo);
		bookService.addBook(book);
		return new ModelAndView("informationform","userInfo",userInfo);
	}
	@RequestMapping(value="/update")
	public ModelAndView updateInfo(@RequestParam("username")String username,@RequestParam("pass")String pass,@RequestParam("gender")String gender,@RequestParam("name")String name,
			@RequestParam("email")String email,@RequestParam("phone")String phone) {
		Account account = accountService.getAccount(username);
		UserInfo user = account.getUserInfo();
		account.setPassword(pass);
		accountService.update(account);
		user.setName(name);
		user.setEmail(email);
		user.setGender(gender);
		user.setPhonenumber(phone);
		user.setEmail(email);
		userInfoService.update(user);
		ModelAndView mo = new ModelAndView("informationform");
		mo.addObject("userInfo", user);
		mo.addObject("account",account);
		
		return mo;
	}
}
