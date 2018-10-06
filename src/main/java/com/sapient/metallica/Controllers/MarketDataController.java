package com.sapient.metallica.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sapient.metallica.Entities.MDCommodity;
import com.sapient.metallica.Entities.RefDataCommodity;
import com.sapient.metallica.Repos.IMDcommodityRepo;
import com.sapient.metallica.Repos.MDcommodityRepo;
import com.sapient.metallica.Repos.RefDataCommodityRepo;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MarketDataController {
	
	@Autowired
	IMDcommodityRepo jpaRepo;
	
	@Autowired
	RefDataCommodityRepo jpaCMD;
	
//	@Autowired
//	MDcommodityRepo temp;
//	
//	@RequestMapping(path="/update", method=RequestMethod.GET)
//	public void findAllCMD(){
//		List<RefDataCommodity> List1 = jpaCMD.findAll();
//				temp.setSymbolName(List1);
//	}

	@RequestMapping(path="/allcommodity", method=RequestMethod.GET)
	public List<MDCommodity> findAllcommodity(){
		List<MDCommodity> prod1 = jpaRepo.findAll();
		return prod1;
	}
	
}
