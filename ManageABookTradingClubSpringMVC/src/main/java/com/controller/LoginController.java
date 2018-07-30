package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value="/loginSuccess")
	public ModelAndView login(@RequestParam("username")String username,@RequestParam("pass")String pass, HttpSession session) {
		Account account =this.account.getAccount(username);
		if (account!=null&&account.getPassword().equals(pass)) {
			session.setAttribute("username",username);
			this.account.getList();
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
