package com.nam.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nam.jpa.entity.CommercialAsset;
import com.nam.jpa.repository.CommercialAssetRepository;

@RestController
public class JpaTestController {

	@Autowired
	CommercialAssetRepository repo;
	
	@GetMapping("/getCommercialAsset/{serviceTag}")
	public CommercialAsset getCommercialAsset(@PathVariable(name = "serviceTag") String serviceTag) {
		
		return repo.getCommercialAssetsForAsset(serviceTag);
	}
}
