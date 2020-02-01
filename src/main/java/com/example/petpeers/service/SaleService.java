package com.example.petpeers.service;

import java.util.List;

import com.example.petpeers.model.PetSale;

public interface SaleService {

	List<PetSale> getAllPetsForSale();

	PetSale purchasePet(int petSaleId,int userId);

	PetSale salePet(String breedname, String breadUrl, int i);

}
