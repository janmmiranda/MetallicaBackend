package com.sapient.metallica.Controllers;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.sapient.metallica.Entities.RefDataCommodity;
import com.sapient.metallica.Entities.RefDataCounterParty;
import com.sapient.metallica.Entities.RefDataLocation;
import com.sapient.metallica.Repos.RefDataCommodityRepo;
import com.sapient.metallica.Repos.RefDataCounterPartyRepo;
import com.sapient.metallica.Repos.RefDataLocationRepo;

public class RefDataControllerTest {

	@Autowired
	RefDataCommodityRepo commodityRepo;
	@Autowired
	RefDataCounterPartyRepo counterPartyRepo;
	@Autowired
	RefDataLocationRepo locationRepo;
	static List<RefDataCommodity> commodityList;
	static List<RefDataCounterParty> counterPartyList;
	static List<RefDataLocation> locationList;
	static RefDataCommodity commodity;
	static RefDataCounterParty counterParty;
	static RefDataLocation location;
	
	@BeforeClass
	public static List<RefDataCommodity> createCommodityList(){
		commodityList = new ArrayList<>();
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
		return commodityList;
		
	}
	
	@BeforeClass
	public static List<RefDataCounterParty> createCounterPartyList(){
		counterParty = new RefDataCounterParty();
		counterParty.setName("Ultron");
		counterPartyList.add(counterParty);
		
		counterParty.setName("Tony Stark");
		counterPartyList.add(counterParty);
		
		counterParty.setName("Logan");
		counterPartyList.add(counterParty);
		
		counterParty.setName("KIM-JONG-UN");
		counterPartyList.add(counterParty);
		return counterPartyList;
		
	}
	
	@BeforeClass
	public static List<RefDataLocation> createLocationList(){
		locationList = new ArrayList<>();
		location = new RefDataLocation();
		location.setCityname("Wakanda");
		locationList.add(location);
		
		location.setCityname("Afghanistan");
		locationList.add(location);
		
		location.setCityname("Canada");
		locationList.add(location);
		
		location.setCityname("North Korea");
		locationList.add(location);
		return locationList;
		
	}
	
	@Test
	public void test() {
		
		assertEquals(createCommodityList(), commodityRepo.findAll());
		assertEquals(createCounterPartyList(), counterPartyRepo.findAll());
		assertEquals(createLocationList(), locationRepo.findAll());
	}

}
