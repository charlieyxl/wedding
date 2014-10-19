package com.awoo.wedding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/*")
public class AdminController
{
	@RequestMapping("hello")
	public String hello()
	{
		return "hello";
	}
}
