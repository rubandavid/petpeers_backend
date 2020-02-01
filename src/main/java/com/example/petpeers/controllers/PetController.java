package com.example.petpeers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.petpeers.model.MyPetsPage;
import com.example.petpeers.service.PetsService;

@RestController
@CrossOrigin
public class PetController {

	@Autowired
	private PetsService petsService;
	
	@GetMapping("/my_pets")
	public List<MyPetsPage> getMyPetsDetails(@RequestParam int userId) {
		
		return petsService.getMyPetsDetails(userId);
		
	}
	
	@GetMapping("/test")
	public  String test() {
		System.out.println("Passes");
		return "sdfsdf";
		
	}
	
}

