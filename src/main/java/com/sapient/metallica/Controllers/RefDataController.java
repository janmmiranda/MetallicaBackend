package com.sapient.metallica.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sapient.metallica.Entities.RefDataCounterParty;
import com.sapient.metallica.Entities.RefDataLocation;
import com.sapient.metallica.Repos.RefDataCommodityRepo;

@SpringBootApplication
@EntityScan({"com.sapient.metallica.Entities.RefDataCounterParty"})
@RestController
@RequestMapping("/api")
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
