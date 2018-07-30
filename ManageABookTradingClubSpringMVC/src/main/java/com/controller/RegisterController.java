package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AccountDao;
import com.dao.UserInfoDao;
import com.model.Account;
import com.model.UserInfo;

@Controller
public class RegisterController {
	
	@Autowired
	UserInfoDao userInfoDao;
	@Autowired
	AccountDao accountDao;

	@RequestMapping(value = "/register")
	public ModelAndView showRegisterPage() {
		return new ModelAndView("register");
	}

	@RequestMapping(value = "/form")
	public ModelAndView register(@RequestParam("username") String username, @RequestParam("pass") String pass,
			@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("phone") String phone,
			@RequestParam("gender") String gender) {
		Account acc= accountDao.getAccount(username);
		UserInfo userInfo = new UserInfo();
		if(acc!=null) {
			return new ModelAndView("register", "message", "alert('Account existed')");
		}

		if ((!checkPhone(phone)) && phone != "") {
			return new ModelAndView("register", "message", "alert('phone number is incorrect!!!')");
		}
		acc = new Account();
		acc.setUsername(username);
		acc.setPassword(pass);
		userInfo.setName(name);
		userInfo.setEmail(email);
		userInfo.setDecentralization(false);
		userInfo.setGender(gender);
		userInfo.setPhonenumber(phone);
		userInfo.setAccount(acc);
		this.accountDao.save(acc);
		this.userInfoDao.save(userInfo);

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
