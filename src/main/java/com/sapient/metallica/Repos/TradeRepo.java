package com.sapient.metallica.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.sapient.metallica.Entities.TradeEntity;

public interface TradeRepo extends JpaRepository<TradeEntity, Integer>, JpaSpecificationExecutor<TradeEntity>{

	public TradeEntity findByTradeId(int TradeId);
}
