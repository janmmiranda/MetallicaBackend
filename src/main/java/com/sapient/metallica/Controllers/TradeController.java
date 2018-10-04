package com.sapient.metallica.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
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
	 * Test Method 
	 */
	@RequestMapping(path="/test", method=RequestMethod.GET)
	public ResponseEntity<String> testMethod() {
		return new ResponseEntity<>("This is a test", HttpStatus.ACCEPTED);
	}
	
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
	@RequestMapping(path="/trade/add", method=RequestMethod.POST)
	public ResponseEntity<String> addTrade(@RequestBody TradeEntity trade) {
		tradeRepo.save(trade);
		return new ResponseEntity<>("Successfully added new trade", HttpStatus.ACCEPTED);
	}
	
	/*
	 * Method for updating a trade
	 */
	@RequestMapping(path="trade/update", method=RequestMethod.PUT)
	public ResponseEntity<String> updateTrade(@RequestParam("id")int id, @RequestBody TradeEntity utrade) {
		TradeEntity trade = tradeRepo.getOne(id);
		trade = utrade;
		return new ResponseEntity<>("Successfully updated trade", HttpStatus.ACCEPTED);
	}
	/*
	 * Method for deleting a trade
	 */
	@RequestMapping(path="trade/delete", method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteTrade(@RequestParam("id")int id) {
		tradeRepo.deleteById(id);
		return new ResponseEntity<>("Successfully deleted trade", HttpStatus.ACCEPTED);
	}
}
