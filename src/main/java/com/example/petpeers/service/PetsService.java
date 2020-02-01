package com.example.petpeers.service;

import java.util.List;

import com.example.petpeers.model.MyPetsPage;

public interface PetsService {

	List<MyPetsPage> getMyPetsDetails(int userId);
 
}
