package com.sapient.metallica.Repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sapient.metallica.Entities.RefDataLocation;



import com.sapient.metallica.Entities.RefDataCounterParty;
import com.sapient.metallica.Entities.RefDataLocation;

//public interface RefDataRepo extends JpaRepository<RefDataCounterParty, Integer>{
//	
//}
public interface RefDataLocationRepo extends JpaRepository<RefDataLocation, Integer>{
	
}
