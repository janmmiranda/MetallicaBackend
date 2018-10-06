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

import com.sapient.metallica.Entities.RefDataCommodity;
import com.sapient.metallica.Entities.RefDataCounterParty;
import com.sapient.metallica.Entities.RefDataLocation;
import com.sapient.metallica.Entities.TradeEntity;
import com.sapient.metallica.Repos.RefDataCommodityRepo;
import com.sapient.metallica.Repos.RefDataCounterPartyRepo;
import com.sapient.metallica.Repos.RefDataLocationRepo;
import com.sapient.metallica.Repos.TradeRepo;
import com.sapient.metallica.helpers.SearchCriteria;

@RestController
@RequestMapping("/trade")
@CrossOrigin("*")
public class TradeController {

	@Autowired
	TradeRepo tradeRepo;
	@Autowired
	RefDataCommodityRepo commRepo;
	@Autowired
	RefDataCounterPartyRepo cpRepo;
	@Autowired
	RefDataLocationRepo locRepo;
	
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
	@RequestMapping(path="/find/all", method=RequestMethod.GET)
	public List<TradeEntity> fetchAllTrades() {
		List<TradeEntity> trades = tradeRepo.findAll();
		return trades;
	}
	
	/*
	 * Method for finding a single trade
	 */
	@RequestMapping(path="/find", method=RequestMethod.GET)
	public ResponseEntity<TradeEntity> findTrade(@RequestParam("id")int id) {
		TradeEntity tTrade = tradeRepo.getOne(id);
		if(tTrade != null) {
			return new ResponseEntity<>(tTrade, HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>(tTrade, HttpStatus.NO_CONTENT);
	}
	/*
	 * Method for finding trades based on a set criteria
	 */
	@RequestMapping(path="/search", method=RequestMethod.POST)
	public List<TradeEntity> searchTrades(@RequestBody SearchCriteria sc) {
		List<TradeEntity> trades = tradeRepo.findAll(SearchCriteria.searchSpec(sc));
		return trades;
	}
	
	/*
	 * Method for adding a trade
	 */
	@RequestMapping(path="/add", method=RequestMethod.POST)
	public ResponseEntity<String> addTrade(@RequestParam("rdcomId")int rdcId, 
										   @RequestParam("rdcpId")int rdcpId,
										   @RequestParam("rdlId")int rdlId,
										   @RequestBody TradeEntity trade) {
		RefDataCommodity rdComm = commRepo.getOne(rdcId);
		RefDataCounterParty rdCP = cpRepo.getOne(rdcpId);
		RefDataLocation rdLoc = locRepo.getOne(rdlId);
		
		if(rdComm != null || rdCP != null || rdLoc != null) {
			trade.setCommodity(rdComm);
			trade.setCounterParty(rdCP);
			trade.setLocation(rdLoc);
			tradeRepo.save(trade);
			return new ResponseEntity<>("Successfully added new trade", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("Failed to add trade", HttpStatus.CONFLICT);
	}
	
	/*
	 * Method for updating a trade
	 */
	@RequestMapping(path="/update", method=RequestMethod.PUT)
	public ResponseEntity<String> updateTrade(@RequestParam("rdcomId")int rdcId, 
										      @RequestParam("rdcpId")int rdcpId,
										      @RequestParam("rdlId")int rdlId,
										      @RequestBody TradeEntity utrade) {
		RefDataCommodity rdComm = commRepo.getOne(rdcId);
		RefDataCounterParty rdCP = cpRepo.getOne(rdcpId);
		RefDataLocation rdLoc = locRepo.getOne(rdlId);
		
		TradeEntity trade = tradeRepo.getOne(utrade.getTradeId());
		trade.setSide(utrade.getSide());
		trade.setStatus(utrade.getStatus());
		trade.setQuantity(utrade.getQuantity());
		trade.setPrice(utrade.getPrice());
		trade.setCommodity(rdComm);
		trade.setCounterParty(rdCP);
		trade.setLocation(rdLoc);
		tradeRepo.save(trade);
		return new ResponseEntity<>("Successfully updated trade", HttpStatus.ACCEPTED);
	}
	/*
	 * Method for deleting a trade
	 */
	@RequestMapping(path="/delete", method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteTrade(@RequestParam("id")int id) {
		tradeRepo.deleteById(id);
		return new ResponseEntity<>("Successfully deleted trade", HttpStatus.ACCEPTED);
	}
}
