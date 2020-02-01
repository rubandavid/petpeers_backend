package com.example.petpeers.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petpeers.model.PetSale;

@Repository
public interface SaleRepository extends JpaRepository<PetSale,Integer>{

  
}
