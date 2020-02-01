package com.example.petpeers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.petpeers.model.PetSale;
import com.example.petpeers.service.SaleService;


@CrossOrigin
@RestController
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping(name="/all_pets")
	public List<PetSale> getAllPetSaleList(){
		
		
		return saleService.getAllPetsForSale();
	}
	
	@PostMapping("/purchase_pet")
	public PetSale purchasePet(@RequestParam()int petSaleId,@RequestParam int userId) {
		return saleService.purchasePet(petSaleId,userId);
	}
	@PostMapping("/sale_pet")
	public PetSale salePet(@RequestParam()String breedname,@RequestParam String breadUrl) {
		return saleService.salePet(breedname,breadUrl,1);
	}
	
}
