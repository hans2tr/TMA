package com.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

	@RequestMapping(value="/register")
	public ModelAndView showRegisterPage() {
		return new ModelAndView("register") ;
	}
	@RequestMapping(value="/form")
	public ModelAndView register(HttpServletRequest req, HttpServletResponse res) {
		String username = req.getParameter("username");
		String pass = req.getParameter("pass");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		
		if((!checkPhone(phone))&&phone!="") {
			return new ModelAndView("register","message","alert('phone number is incorrect!!!')");
		}

		return new ModelAndView("login");
	}

	public boolean checkPhone(String phone) {
		try {
			Integer.valueOf(phone);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
