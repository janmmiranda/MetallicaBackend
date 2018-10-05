package com.sapient.metallica.helpers;

import org.springframework.beans.factory.annotation.Autowired;

import com.sapient.metallica.Entities.RefDataCommodity;
import com.sapient.metallica.Entities.RefDataCounterParty;
import com.sapient.metallica.Entities.RefDataLocation;
import com.sapient.metallica.Repos.RefDataCommodityRepo;
import com.sapient.metallica.Repos.RefDataCounterPartyRepo;
import com.sapient.metallica.Repos.RefDataLocationRepo;

public class RefDataCreator {

	@Autowired
	RefDataCommodityRepo commodityRepo;
	
	@Autowired
	RefDataCounterPartyRepo cpRepo;
	
	@Autowired
	RefDataLocationRepo locationRepo;

	public void createRefData() {
		// TODO Auto-generated method stub
		RefDataCommodity commodity = new RefDataCommodity("Vb", "Vibranium");
		RefDataLocation location = new RefDataLocation("Kanpur");
		RefDataCounterParty cp = new RefDataCounterParty("Tony Stark");
		
		commodityRepo.save(commodity);
		cpRepo.save(cp);
		locationRepo.save(location);
	}
}