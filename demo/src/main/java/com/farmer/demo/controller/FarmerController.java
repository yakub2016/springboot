package com.farmer.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.farmer.demo.exception.ResourceNotFoundException;
import com.farmer.demo.model.Farmer;
import com.farmer.demo.repository.FarmerRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")

public class FarmerController {

    @Autowired
    private FarmerRepository farmerrepository;
    
    

    // get all websites
    @GetMapping("/farmers")
    public List < Farmer > getAllFarmers() {
        return farmerrepository.findAll();
    }
    
    
    
 // create website rest api
    @PostMapping("/farmers")
    public Farmer createFarmer(@RequestBody Farmer farmer) {
    	return farmerrepository.save(farmer);
    }

    // delete website rest api
    @DeleteMapping("/farmers/{id}")
    public ResponseEntity < Map < String, Boolean >> deleteFarmer(@PathVariable Long id) {
    	Farmer farmer = farmerrepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Website not exist with id :" + id));

        farmerrepository.delete(farmer);
        Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    
    
  //get website by id rest api
    @GetMapping("/farmers/{id}")
    public ResponseEntity < Farmer > getFarmerById(@PathVariable Long id) {
    	Farmer farmer = farmerrepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Website not exist with id :" + id));
        return ResponseEntity.ok(farmer);
    }
        
    
    
    
  @PutMapping("/farmers/{id}")
  public ResponseEntity < Farmer > updateFarmer(@PathVariable Long id, @RequestBody Farmer farmer) {
  	Farmer Farmer = farmerrepository.findById(id)
          .orElseThrow(() -> new ResourceNotFoundException("Farmer not exist with id :" + id));

  	farmer.setName(farmer.getName());
      farmer.setEmail(farmer.getEmail());
      farmer.setPhone(farmer.getPhone());
      farmer.setAddress(farmer.getAddress());
      farmer.setItems(farmer.getItems());
      farmer.setQuantity(farmer.getQuantity());
      farmer.setWeights(farmer.getWeights());

      

      Farmer updatedFarmer = farmerrepository.save(farmer);
      return ResponseEntity.ok(updatedFarmer);
  }
  
  
  

    


}
