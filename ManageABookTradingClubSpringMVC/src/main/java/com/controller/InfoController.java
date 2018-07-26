package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InfoController {
	
	@RequestMapping(value="/inform")
	public ModelAndView update(HttpServletRequest req,HttpServletResponse pes) {
		return new ModelAndView("informationform");
	}
}
