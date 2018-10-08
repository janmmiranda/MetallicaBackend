package com.sapient.metallica.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.metallica.Entities.MDCommodity;
import com.sapient.metallica.Repos.IMDcommodityRepo;


@RestController
@RequestMapping("/marketdata")
@CrossOrigin("*")
public class MarketDataController {
	
	@Autowired
	IMDcommodityRepo jpaRepo;	

	@RequestMapping(path="/fetchCommodities", method=RequestMethod.GET)
	public List<MDCommodity> findAllcommodity() throws Exception{
		List<MDCommodity> commodities = jpaRepo.findAll();
		
		return commodities;
	}

}
