package com.controller;

import java.util.List;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Account;
import com.model.Book;
import com.service.AccountService;
import com.service.BookService;

@Controller
public class LoginController {
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private BookService bookService;

	@RequestMapping({"/","/login"})
	public ModelAndView showLogin() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/loginSuccess")
	public ModelAndView login(@RequestParam("username")String username,@RequestParam("pass")String pass, HttpSession session) {
		Account account =accountService.getAccount(username);
		if (account!=null&&account.getPassword().equals(pass)) {
			session.setAttribute("username",username);
//			this.accountDao.getList();
			ModelAndView mo = new ModelAndView("mainpage");
			List<Book> bookList = bookService.getBookList();
			mo.addObject("bookList",bookList);
			return mo;
		} else {
			return new ModelAndView("login","message","alert('login error')");
		}
	}
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		return "login";
	}

}
