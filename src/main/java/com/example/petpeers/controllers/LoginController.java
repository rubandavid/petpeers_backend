package com.example.petpeers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.petpeers.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping
	public String login(@RequestParam String name , @RequestParam String password) {
		return loginService.validate(name,password);
	}
	
	
	
	
}
