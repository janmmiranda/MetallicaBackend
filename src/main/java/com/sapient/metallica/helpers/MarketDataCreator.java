package com.sapient.metallica.helpers;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sapient.metallica.Entities.MDCommodity;
import com.sapient.metallica.Repos.IMDcommodityRepo;

@Component
public class MarketDataCreator {
	
	@Autowired
	IMDcommodityRepo jpaRepo;
	
	@PostConstruct
	public void setData() {   //set static data in database
		
		MDCommodity commodity1 = new MDCommodity(getRandomNumber(),"FE", "Iron");
		MDCommodity commodity2 = new MDCommodity(getRandomNumber(),"CU", "Copper");
		MDCommodity commodity3 = new MDCommodity(getRandomNumber(),"AL", "Aluminum");
		MDCommodity commodity4 = new MDCommodity(getRandomNumber(),"AG", "Silver");
		MDCommodity commodity5 = new MDCommodity(getRandomNumber(),"SN", "TIN");
		MDCommodity commodity6 = new MDCommodity(getRandomNumber(),"AU", "GOLD");
		MDCommodity commodity7 = new MDCommodity(getRandomNumber(),"NI", "Nickel");
		MDCommodity commodity8 = new MDCommodity(getRandomNumber(),"VB", "Vibranium");
		MDCommodity commodity9 = new MDCommodity(getRandomNumber(),"CO", "Cobalt");
		MDCommodity commodity10 = new MDCommodity(getRandomNumber(),"ZN", "Zinc");
		MDCommodity commodity11 = new MDCommodity(getRandomNumber(),"TH", "Thorium");
		MDCommodity commodity12 = new MDCommodity(getRandomNumber(),"U", "Uranium");
		
		jpaRepo.save(commodity1);
		jpaRepo.save(commodity2);
		jpaRepo.save(commodity3);
		jpaRepo.save(commodity4);
		jpaRepo.save(commodity5);
		jpaRepo.save(commodity6);
		jpaRepo.save(commodity7);
		jpaRepo.save(commodity8);
		jpaRepo.save(commodity9);
		jpaRepo.save(commodity10);
		jpaRepo.save(commodity11);
		jpaRepo.save(commodity12);
	}
	
	public static float getRandomNumber(){
	    float x = (float)(Math.random() * 5000 + 500);//price range between 500 to 5000
	    return x;
	}

}

