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

	RefDataCommodity commodity, commodity1, commodity2, commodity3;
	RefDataCounterParty counterParty, counterParty1, counterParty2, counterParty3;
	RefDataLocation location, location1, location2, location3;

	@Autowired
	RefDataCommodityRepo commodityRepo;

	@Autowired
	RefDataCounterPartyRepo counterPartyRepo;

	@Autowired
	RefDataLocationRepo locationRepo;

	@PostConstruct
	public void createRefData() {
		
		System.out.println("in create rd");
		commodity = commodityRepo.findBySymbol("Vb");
		if (commodity == null) {
			commodity = new RefDataCommodity();
			commodity.setSymbol("Vb");
			commodity.setName("Vibranium");
			commodityRepo.save(commodity);
			
			commodity1 = new RefDataCommodity();
			commodity1.setSymbol("Pd");
			commodity1.setName("Palladium");
			commodityRepo.save(commodity1);
			
			commodity2 = new RefDataCommodity();
			commodity2.setSymbol("Ad");
			commodity2.setName("Adamantium");
			commodityRepo.save(commodity2);
			
			commodity3 = new RefDataCommodity();
			commodity3.setSymbol("U");
			commodity3.setName("Uranium-235");
			commodityRepo.save(commodity3);


			counterParty = new RefDataCounterParty();
			counterParty.setName("Ultron");
			counterPartyRepo.save(counterParty);
			
			counterParty1 = new RefDataCounterParty();
			counterParty1.setName("Tony Stark");
			counterPartyRepo.save(counterParty1);
			
			counterParty2 = new RefDataCounterParty();
			counterParty2.setName("Logan");
			counterPartyRepo.save(counterParty2);
			
			counterParty3 = new RefDataCounterParty();
			counterParty3.setName("KIM-JONG-UN");
			counterPartyRepo.save(counterParty3);
			
			
			location = new RefDataLocation();
			location.setCityname("Wakanda");
			locationRepo.save(location);
			
			location1 = new RefDataLocation();
			location1.setCityname("Afghanistan");
			locationRepo.save(location1);
			
			location2 = new RefDataLocation();
			location2.setCityname("Canada");
			locationRepo.save(location2);
			
			location3 = new RefDataLocation();
			location3.setCityname("USA");
			locationRepo.save(location3);
			
			//locationRepo.saveAll(locationList);
		}

	}
}
