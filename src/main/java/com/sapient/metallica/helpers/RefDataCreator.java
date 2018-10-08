package com.sapient.metallica.helpers;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sapient.metallica.Entities.RefDataCommodity;
import com.sapient.metallica.Entities.RefDataCounterParty;
import com.sapient.metallica.Entities.RefDataLocation;
import com.sapient.metallica.Repos.RefDataCommodityRepo;
import com.sapient.metallica.Repos.RefDataCounterPartyRepo;
import com.sapient.metallica.Repos.RefDataLocationRepo;

@Component
public class RefDataCreator {

	RefDataCommodity commodity = new RefDataCommodity();
	RefDataCounterParty counterParty = new RefDataCounterParty(); 
	RefDataLocation location = new RefDataLocation();
	
	@Autowired
	RefDataCommodityRepo commodityRepo;
	
	@Autowired
	RefDataCounterPartyRepo counterPartyRepo;
	
	@Autowired
	RefDataLocationRepo locationRepo;

	@PostConstruct
	public void createRefData() {
		// TODO Auto-generated method stub
		
		
		System.out.println("in create rd");
		for(int i=1; i<=10; i++) {
			
			commodity=commodityRepo.findBySymbol("Vb"+i);
			if(commodity==null) {
				commodity = new RefDataCommodity();
				commodity.setSymbol("Vb"+i);
				commodity.setName("Vibranium"+i);
				commodityRepo.save(commodity);
				
				counterParty = new RefDataCounterParty();
				counterParty.setName("Tony Stark"+i);
				counterPartyRepo.save(counterParty);
				
				location = new RefDataLocation();
				location.setCityname("Kanpur"+i);
				locationRepo.save(location);
			}
			
		}
		
	}
}
