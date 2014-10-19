package com.awoo.wedding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.awoo.wedding.model.Guest;
import com.awoo.wedding.service.GuestService;

@Controller
@RequestMapping("/admin/*")
public class AdminController
{
	@Autowired
	private GuestService guestServe;
	
	@RequestMapping("hello")
	public ModelAndView hello()
	{
//		Guest guest = new Guest();
//		guest.setUserid(1);
//		guest.setName("test");
//		guest.setCompanionNum(2);
//		
//		guestServe.saveGuest(guest);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		return mav;
	}
}
