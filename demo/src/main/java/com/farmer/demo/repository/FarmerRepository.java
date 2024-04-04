package com.farmer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
  
import org.springframework.stereotype.Repository;

import com.farmer.demo.model.Farmer;

public interface FarmerRepository  extends JpaRepository<Farmer, Long> {

}
