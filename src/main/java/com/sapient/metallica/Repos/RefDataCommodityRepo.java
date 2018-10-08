package com.sapient.metallica.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.metallica.Entities.RefDataCommodity;

public interface RefDataCommodityRepo extends JpaRepository<RefDataCommodity, Integer>{

	public RefDataCommodity findBySymbol(String string);
	
}
