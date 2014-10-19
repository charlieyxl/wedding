package com.awoo.wedding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.awoo.wedding.service.GuestService;

@Controller
@RequestMapping("/invitation/*")
public class InvitationController
{
	@Autowired
	private GuestService guestService;
	
	@RequestMapping("1")
	public ModelAndView getInvitation()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
}
