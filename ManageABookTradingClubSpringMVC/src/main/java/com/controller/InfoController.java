package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserInfoDao;
import com.model.UserInfo;

@Controller
public class InfoController {
	
	@Autowired
	UserInfoDao userInfoDao;
	
	@RequestMapping(value="/update")
	public ModelAndView update() {
		return new ModelAndView("informationform");
	}
	@RequestMapping(value="/infoForm")
	public ModelAndView infoPage(HttpSession session) {
		String name = (String) session.getAttribute("username");
		UserInfo userInfo = userInfoDao.getInfoByUsername(name);
		return new ModelAndView("informationform","userInfo",userInfo);
	}
}
