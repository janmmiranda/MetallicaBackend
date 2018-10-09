
package com.sapient.metallica.helpers;

import java.util.ArrayList;
import java.util.List;
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

	RefDataCommodity commodity;
	RefDataCounterParty counterParty;
	RefDataLocation location;

	@Autowired
	RefDataCommodityRepo commodityRepo;

	@Autowired
	RefDataCounterPartyRepo counterPartyRepo;

	@Autowired
	RefDataLocationRepo locationRepo;

//	List<RefDataCommodity> commodityList;
//	List<RefDataCounterParty> counterPartyList;
//	List<RefDataLocation> locationList;

	@PostConstruct
	public void createRefData() {
		
//		commodityList = new ArrayList<>();
//		counterPartyList = new ArrayList<>();
//		locationList = new ArrayList<>();
		System.out.println("in create rd");
		commodity = new RefDataCommodity();
		commodity = commodityRepo.findBySymbol("Vb");
		if (commodity == null) {
			commodity = new RefDataCommodity();
			commodity.setSymbol("Vb");
			commodity.setName("Vibranium");
			commodityRepo.save(commodity);
//			commodityList.add(commodity);
			
			commodity = new RefDataCommodity();
			commodity.setSymbol("Pd");
			commodity.setName("Palladium");
			commodityRepo.save(commodity);
//			commodityList.add(commodity);
			
			commodity = new RefDataCommodity();
			commodity.setSymbol("Ad");
			commodity.setName("Adamantium");
			commodityRepo.save(commodity);
//			commodityList.add(commodity);
			
			commodity = new RefDataCommodity();
			commodity.setSymbol("U");
			commodity.setName("Uranium-235");
			commodityRepo.save(commodity);
//			commodityList.add(commodity);
			
			
			counterParty = new RefDataCounterParty();
			counterParty.setName("Ultron");
			counterPartyRepo.save(counterParty);
//			counterPartyList.add(counterParty);
			
			counterParty = new RefDataCounterParty();
			counterParty.setName("Tony Stark");
			counterPartyRepo.save(counterParty);
//			counterPartyList.add(counterParty);
			
			counterParty = new RefDataCounterParty();
			counterParty.setName("Logan");
			counterPartyRepo.save(counterParty);
//			counterPartyList.add(counterParty);
			
			counterParty = new RefDataCounterParty();
			counterParty.setName("KIM-JONG-UN");
			counterPartyRepo.save(counterParty);
//			counterPartyList.add(counterParty);
			
//			counterPartyRepo.saveAll(counterPartyList);
			
			location = new RefDataLocation();
			location.setCityname("Wakanda");
			locationRepo.save(location);
//			locationList.add(location);
			
			location = new RefDataLocation();
			location.setCityname("Afghanistan");
			locationRepo.save(location);
//			locationList.add(location);
			
			location = new RefDataLocation();
			location.setCityname("Canada");
			locationRepo.save(location);
//			locationList.add(location);
			
			location = new RefDataLocation();
			location.setCityname("North Korea");
			locationRepo.save(location);
//			locationList.add(location);		
		}

	}
}
