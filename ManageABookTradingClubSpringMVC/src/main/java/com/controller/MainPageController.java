package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainPageController {
	
	@RequestMapping(value="/home")
	public ModelAndView home() {
		
		return new ModelAndView("mainpage");
	}
	@RequestMapping(value="/infor")
	public ModelAndView showInfor() {
		return new ModelAndView("informationform");
	}
}
