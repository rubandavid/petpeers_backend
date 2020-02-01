package com.example.petpeers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petpeers.model.MyPetsPage;
@Repository
public interface MyPetsRepository extends JpaRepository<MyPetsPage,Integer>{

	public List<MyPetsPage> findAllByUserId(int userId);
	
}
