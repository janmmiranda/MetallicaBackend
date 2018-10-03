package com.sapient.metallica.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sapient.metallica.Entities.RefDataCounterParty;

public interface RefDataCommodityRepo extends JpaRepository<RefDataCounterParty, Integer>{
	
}
