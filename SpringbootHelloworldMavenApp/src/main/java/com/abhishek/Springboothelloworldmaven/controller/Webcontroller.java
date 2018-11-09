package com.abhishek.Springboothelloworldmaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Webcontroller {
	
	@RequestMapping("/welcome.html")
	public ModelAndView welcomePage() {
		return new ModelAndView("welcome");
		
	}

}
