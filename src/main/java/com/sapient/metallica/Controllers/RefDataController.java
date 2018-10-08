package com.sapient.metallica.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sapient.metallica.Entities.RefDataCounterParty;
import com.sapient.metallica.Entities.RefDataLocation;
import com.sapient.metallica.Repos.MDcommodityRepo;
import com.sapient.metallica.Repos.RefDataCommodityRepo;
import com.sapient.metallica.Repos.RefDataCounterPartyRepo;
import com.sapient.metallica.Repos.RefDataLocationRepo;

@SpringBootApplication
@EntityScan({"com.sapient.metallica.Entities.RefDataCounterParty"})
@RestController
@RequestMapping("/refdata")
@CrossOrigin("*")
public class RefDataController {

	@Autowired
	RefDataCommodityRepo commodityRepo;

	@Autowired
	RefDataCounterPartyRepo counterPartyRepo;

	@Autowired
	RefDataLocationRepo locationRepo;

	@Autowired
	MDcommodityRepo mcr;
	@RequestMapping(path = "/commodity", method = RequestMethod.GET)
	public List<RefDataCommodity> fetchCommodities() {

		List<RefDataCommodity> commodityList = commodityRepo.findAll();
		mcr.setSymbolName(commodityList);
		return commodityList;
	}

	@RequestMapping(path = "/location", method = RequestMethod.GET)
	public List<RefDataLocation> fetchLocations() {

		List<RefDataLocation> locationList = locationRepo.findAll();
		return locationList;
	}

	@RequestMapping(path = "/counterparty", method = RequestMethod.GET)
	public List<RefDataCounterParty> fetchCounterParties() {

		List<RefDataCounterParty> counterPartyList = counterPartyRepo.findAll();
		return counterPartyList;
	}
}
