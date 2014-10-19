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
	
	@RequestMapping(value="index")
	public ModelAndView getIndex()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value="story")
	public ModelAndView getStory()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("story");
		return mav;
	}
	
	@RequestMapping(value="ablumn")
	public ModelAndView getAlbumn()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("ablumn");
		return mav;
	}
	
	@RequestMapping(value="invitation")
	public ModelAndView getInvitation()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("invitation");
		return mav;
	}
	
	@RequestMapping(value="map")
	public ModelAndView getMap()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("map");
		return mav;
	}
	
	@RequestMapping(value="signup")
	public ModelAndView getSignup()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("signup");
		return mav;
	}
}
