package com.example.petpeers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petpeers.model.MyPetsPage;
import com.example.petpeers.model.PetSale;
import com.example.petpeers.repository.MyPetsRepository;
import com.example.petpeers.repository.SaleRepository;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleRepository saleRepository;
	@Autowired
	private MyPetsRepository mypetRepository;
	
	@Override
	public List<PetSale> getAllPetsForSale() {
		
		return saleRepository.findAll();
	}

	@Override
	public PetSale purchasePet(int petSaleId,int userId) {
		
		PetSale petSale = saleRepository.getOne(petSaleId);
		
		petSale.setSoldStatus(1);
		
		petSale = saleRepository.save(petSale);
		

		MyPetsPage page = new MyPetsPage();
		page.setMy_pet_id(petSaleId);
		page.setUserId(userId);
		mypetRepository.save(page);
		
		return petSale;
	}

	@Override
	public PetSale salePet(String breedname, String breedUrl, int i) {
		
		PetSale petSale = new PetSale();
		petSale.setBreadName(breedname);
		petSale.setBreadUrl(breedUrl);
		petSale.setSoldStatus(0);
		return saleRepository.save(petSale);
	}

}
