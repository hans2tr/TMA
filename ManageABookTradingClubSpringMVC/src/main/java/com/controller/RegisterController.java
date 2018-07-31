package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Account;
import com.model.UserInfo;
import com.service.AccountService;
import com.service.UserInfoService;

@Controller
public class RegisterController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/register")
	public ModelAndView showRegisterPage() {
		return new ModelAndView("register");
	}

	@RequestMapping(value = "/form")
	public ModelAndView register(@RequestParam("username") String username, @RequestParam("pass") String pass,
			@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("phone") String phone,
			@RequestParam("gender") String gender) {
		Account acc= accountService.getAccount(username);
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
		this.accountService.save(acc);
		this.userInfoService.save(userInfo);

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
