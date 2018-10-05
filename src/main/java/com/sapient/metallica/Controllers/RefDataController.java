package com.sapient.metallica.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.metallica.Entities.RefDataCommodity;
import com.sapient.metallica.Entities.RefDataCounterParty;
import com.sapient.metallica.Entities.RefDataLocation;
import com.sapient.metallica.Repos.RefDataCommodityRepo;

@RestController
@CrossOrigin("*")
public class RefDataController {

	@Autowired
	RefDataCommodityRepo commodityRepo;

	@Autowired
	RefDataCounterParty counterPartyRepo;

	@Autowired
	RefDataLocation locationRepo;

//	public List<RefDataCommodity> fetchCommodities() {
//		
//		
//	}
//
//	public List<RefDataLocation> fetchLocations() {
//
//	}
//
//	public List<RefDataCounterParty> fetchCounterParties() {
//
//	}
}
