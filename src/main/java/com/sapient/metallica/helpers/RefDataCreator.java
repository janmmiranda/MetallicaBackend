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

	List<RefDataCommodity> commodityList;
	List<RefDataCounterParty> counterPartyList;
	List<RefDataLocation> locationList;

	@PostConstruct
	public void createRefData() {
		// TODO Auto-generated method stub

		commodityList = new ArrayList<>();
		counterPartyList = new ArrayList<>();
		locationList = new ArrayList<>();
		System.out.println("in create rd");
		commodity = commodityRepo.findBySymbol("Vb");
		if (commodity == null) {
			commodity = new RefDataCommodity();
			commodity.setSymbol("Vb");
			commodity.setName("Vibranium");
			commodityList.add(commodity);
			
			commodity.setSymbol("Pd");
			commodity.setName("Palladium");
			commodityList.add(commodity);
			
			commodity.setSymbol("Ad");
			commodity.setName("Adamantium");
			commodityList.add(commodity);
			
			commodity.setSymbol("U");
			commodity.setName("Uranium-235");
			commodityList.add(commodity);
			
			commodityRepo.saveAll(commodityList);

			counterParty = new RefDataCounterParty();
			counterParty.setName("Ultron");
			counterPartyList.add(counterParty);
			
			counterParty.setName("Tony Stark");
			counterPartyList.add(counterParty);
			
			counterParty.setName("Logan");
			counterPartyList.add(counterParty);
			
			counterParty.setName("KIM-JONG-UN");
			counterPartyList.add(counterParty);
			
			counterPartyRepo.saveAll(counterPartyList);
			
			location = new RefDataLocation();
			location.setCityname("Wakanda");
			locationList.add(location);
			
			location.setCityname("Afghanistan");
			locationList.add(location);
			
			location.setCityname("Canada");
			locationList.add(location);
			
			location.setCityname("USA");
			locationList.add(location);
			
			locationRepo.saveAll(locationList);
		}

	}
}
