package com.sapient.metallica.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.metallica.Entities.MDCommodity;

import com.sapient.metallica.Repos.IMDCommodity;
import com.sapient.metallica.Repos.IMDcommodityRepo;
import com.sapient.metallica.Repos.MDcommodityRepo;



@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MarketDataController {
	
	@Autowired
	IMDcommodityRepo jpaRepo;
	
	@Autowired
	IMDCommodity abc;
	
	@Autowired
	MDcommodityRepo xyz;
	
	MDCommodity update1;

	@RequestMapping(path="/allcommodity", method=RequestMethod.GET)
	public List<MDCommodity> findAllcommodity() throws Exception{
		List<MDCommodity> prod1 = jpaRepo.findAll();
		if(prod1.size()==0) {
			xyz.add1(update1);
		}
		return prod1;
	}
	
	@RequestMapping(path="/allcommodity/{id}", method=RequestMethod.PUT)
	public MDCommodity updateProduct(@PathVariable("id")int id,@RequestBody MDCommodity update){
		//System.out.println("REST Controller code invoked..");
		MDCommodity temp =xyz.findProductById(id);
		temp = update;
		jpaRepo.save(temp);
		return update;
	}

}
