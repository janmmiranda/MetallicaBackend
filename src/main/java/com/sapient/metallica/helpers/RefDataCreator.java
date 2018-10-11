
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

	RefDataCommodity commodity1, commodity2,commodity3,commodity4;
	RefDataCounterParty counterParty1,counterParty2,counterParty3,counterParty4;
	RefDataLocation location1,location2,location3,location4;

	@Autowired
	RefDataCommodityRepo commodityRepo;
	@Autowired
	RefDataCounterPartyRepo counterPartyRepo;
	@Autowired
	RefDataLocationRepo locationRepo;

	@PostConstruct
	public void createRefData() {
		
		System.out.println("in create rd");
		
		commodity1 = commodityRepo.findBySymbol("Vb");
		System.out.println(commodity1);
		if (commodity1 == null) {
			commodity1 = new RefDataCommodity();
			commodity1.setSymbol("Vb");
			commodity1.setName("Vibranium");
			commodityRepo.save(commodity1);
			
			commodity2 = new RefDataCommodity();
			commodity2.setSymbol("Pd");
			commodity2.setName("Palladium");
			commodityRepo.save(commodity2);
			
			commodity3 = new RefDataCommodity();
			commodity3.setSymbol("Ad");
			commodity3.setName("Adamantium");
			commodityRepo.save(commodity3);
			
			commodity4 = new RefDataCommodity();
			commodity4.setSymbol("U");
			commodity4.setName("Uranium-235");
			commodityRepo.save(commodity4);
				
			counterParty1 = new RefDataCounterParty();
			counterParty1.setName("Ultron");
			counterPartyRepo.save(counterParty1);
			
			counterParty2 = new RefDataCounterParty();
			counterParty2.setName("Tony Stark");
			counterPartyRepo.save(counterParty2);
			
			counterParty3 = new RefDataCounterParty();
			counterParty3.setName("Logan");
			counterPartyRepo.save(counterParty3);
			
			counterParty4 = new RefDataCounterParty();
			counterParty4.setName("KIM-JONG-UN");
			counterPartyRepo.save(counterParty4);
			
			location1 = new RefDataLocation();
			location1.setCityname("Wakanda");
			locationRepo.save(location1);
			
			location2 = new RefDataLocation();
			location2.setCityname("Afghanistan");
			locationRepo.save(location2);
			
			location3 = new RefDataLocation();
			location3.setCityname("Canada");
			locationRepo.save(location3);
			
			location4 = new RefDataLocation();
			location4.setCityname("North Korea");
			locationRepo.save(location4);	
		}

	}
}
