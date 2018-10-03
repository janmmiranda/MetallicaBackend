package com.sapient.metallica.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.metallica.Entities.TradeEntity;
import com.sapient.metallica.Repos.TradeRepo;

@RestController
@RequestMapping("/metal")
@CrossOrigin("*")
public class TradeController {

	@Autowired
	TradeRepo tradeRepo;
	
	/*
	 * Method for fetching all trades
	 */
	@RequestMapping(path="/trade/find/all", method=RequestMethod.GET)
	public List<TradeEntity> fetchAllTrades() {
		List<TradeEntity> trades = tradeRepo.findAll();
		return trades;
	}
	
	/*
	 * Method for finding a single trade
	 */
	@RequestMapping(path="/trade/find", method=RequestMethod.GET)
	public ResponseEntity<TradeEntity> findTrade(@RequestParam("id")int id) {
		TradeEntity tTrade = tradeRepo.getOne(id);
		if(tTrade != null) {
			return new ResponseEntity<>(tTrade, HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>(tTrade, HttpStatus.NO_CONTENT);
	}
	
	/*
	 * Method for adding a trade
	 */
	
	/*
	 * Method for updating a trade
	 */
	
	/*
	 * Method for deleting a trade
	 */
}
