package com.example.petpeers.service;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

	@Override
	public String validate(String name, String password) {
		
		return name.equals("admin") && password.equals("1") ? "Success" : "Fail";
		
	}
	
	
}
