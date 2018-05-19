package com.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.beans.Factory;
import com.spring.beans.Furniture;
import com.spring.repositories.FactoryRepository;
import com.spring.repositories.FurnitureRepository;
import com.spring.utils.ApplicationResponse;

@RestController
@RequestMapping(path="/shop")
@CrossOrigin(allowCredentials="true", origins="http://localhost:4200")
public class FurnitureController {

	@Autowired
	private FurnitureRepository furnitureRepo;
	
	@Autowired
	private FactoryRepository factoryRepo;

    @PostMapping(path="/createFurniture")
    public @ResponseBody ApplicationResponse createNewFurniture(@RequestBody Furniture furniture) {
    	this.furnitureRepo.save(furniture);
    	return new ApplicationResponse(0, "Furniture has been added successfully to database.");
    }
    
    @GetMapping(path="/getFurniture")
    public @ResponseBody Object getFurniture() {
    	return this.furnitureRepo.findAll();
    }
    
    @PostMapping(path="/createFactory")
    public @ResponseBody ApplicationResponse createNewFactory(@RequestBody Factory factory) {
    	this.factoryRepo.save(factory);
    	return new ApplicationResponse(0, "Factory has been added successfully to database.");
    }
}
