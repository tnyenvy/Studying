package com.example.Login_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String WelcomePage(ModelMap model, @RequestParam String userID, @RequestParam String password) {
		if(userID.equals("admin") && password.equals("123")) {
			model.put("userID", userID); //show user name on welcome page
			return "welcome";
		}		
		model.put("Error", "Please provide the correct userID and password!");
		return "login";
	}
}
