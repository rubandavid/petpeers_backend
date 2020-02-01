package com.example.petpeers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petpeers.model.MyPetsPage;
import com.example.petpeers.repository.MyPetsRepository;
@Service
public class PetsServiceImpl implements PetsService{

	@Autowired
	private MyPetsRepository petService;
	
	@Override
	public List<MyPetsPage> getMyPetsDetails(int userId) {
		
	
		return null;
	}

}
