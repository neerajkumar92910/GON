package com.program;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class userController {
	@RequestMapping("/")
	public ModelAndView m1()
	{
		ModelAndView mv=new ModelAndView("index");
		return mv;
	}   
}