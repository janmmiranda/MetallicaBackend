package com.sapient.metallica.Controllers;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import com.sapient.metallica.Entities.RefDataCommodity;
import com.sapient.metallica.Entities.RefDataCounterParty;
import com.sapient.metallica.Entities.RefDataLocation;

public class RefDataControllerTest {

	List<RefDataCommodity> commodityList;
	List<RefDataCounterParty> counterPartyList;
	List<RefDataLocation> locationList;
	RefDataCommodity commodity;
	RefDataCounterParty counterParty;
	RefDataLocation location;
	
	public List<RefDataCommodity> createCommodityList(){
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
	
	public List<RefDataCounterParty> createCounterPartyList(){
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
	
	public List<RefDataLocation> createLocationList(){
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
		
		RefDataController refController = new RefDataController();
		assertEquals(createCommodityList(), refController.fetchCommodities());
		assertEquals(createCounterPartyList(), refController.fetchCounterParties());
		assertEquals(createLocationList(), refController.fetchLocations());
	}

}
