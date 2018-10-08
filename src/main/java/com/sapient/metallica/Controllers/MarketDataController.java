package com.sapient.metallica.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.metallica.Entities.MDCommodity;
import com.sapient.metallica.Repos.IMDcommodityRepo;
import com.sapient.metallica.Repos.MDcommodityRepo;

@SpringBootApplication
@EntityScan({"com.sapient.metallica.Entities.MDCommodity"})
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MarketDataController {
	
	@Autowired
	IMDcommodityRepo jpaRepo;
	
	@Autowired
	MDcommodityRepo mdRepo;
	

	@RequestMapping(path="/allcommodity", method=RequestMethod.GET)
	public List<MDCommodity> findAllcommodity() throws Exception{
		List<MDCommodity> commodity1 = jpaRepo.findAll();
		if(commodity1.size()==0) {
			mdRepo.setData();
		}
		return commodity1;
	}
	
//	@RequestMapping(path="/allcommodity/{id}", method=RequestMethod.PUT)
//	public MDCommodity updateData(@PathVariable("id")int id,@RequestBody MDCommodity update){
//		MDCommodity temp =jpaRepo.getOne(id);
//		temp = update;
//		jpaRepo.save(temp);
//		return update;
//	}

}
