package com.concretepage.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@RequestMapping(value="/admin")
	public String adminInfo(ModelMap model, Authentication authentication) {
		model.addAttribute("name", authentication.getName());
 		return "info";
 	}
	@RequestMapping(value="/user")
	public String userInfo(ModelMap model, Authentication authentication) {
		model.addAttribute("name", authentication.getName());
 		return "info";
 	}	
	@RequestMapping(value="/error")
	public String error() {
 		return "access-denied";
 	}
}	