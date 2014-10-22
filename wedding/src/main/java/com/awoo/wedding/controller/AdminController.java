package com.awoo.wedding.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.awoo.wedding.service.GuestService;

@Controller
@RequestMapping("/admin/*")
public class AdminController
{
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private GuestService guestServe;
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView hello(HttpSession httpSession, String username, String password)
	{
		logger.info("User {} logged in.", username);
		httpSession.setAttribute("userid", "1");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", username);
		mav.setViewName("adminPage");
		return mav;
	}
}
