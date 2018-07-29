package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AccountDao;
import com.model.Account;

@Controller
public class LoginController {
	
	@Autowired
	private AccountDao account;

	@RequestMapping({"/","/login"})
	public ModelAndView showLogin() {
		return new ModelAndView("login");
	}
//	
//	@RequestMapping("/login")
//	public ModelAndView showLoginAgain() {
//		return new ModelAndView("login");
//	}
	
	@RequestMapping(value="/mainpage")
	public ModelAndView login(HttpServletRequest req, HttpServletResponse res, HttpSession session) {
		String username = req.getParameter("username");
		String pass = req.getParameter("pass");
		Account account =this.account.checkLogin(username, pass);
		if (account!=null) {
			session.setAttribute("username",username);
			return new ModelAndView("mainpage","account",account);
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
