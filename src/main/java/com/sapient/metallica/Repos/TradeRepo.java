package com.sapient.metallica.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.metallica.Entities.TradeEntity;

public interface TradeRepo extends JpaRepository<TradeEntity, Integer>{

	public TradeEntity findByTradeId(int TradeId);
}
