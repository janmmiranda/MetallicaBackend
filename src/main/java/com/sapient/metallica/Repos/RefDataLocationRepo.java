package com.sapient.metallica.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< Upstream, based on origin/Lalit

import com.sapient.metallica.Entities.RefDataLocation;

public interface RefDataLocationRepo extends JpaRepository<RefDataLocation, Integer>{

	
}
=======
import com.sapient.metallica.Entities.RefDataCounterParty;
import com.sapient.metallica.Entities.RefDataLocation;

//public interface RefDataRepo extends JpaRepository<RefDataCounterParty, Integer>{
//	
//}
public interface RefDataLocationRepo extends JpaRepository<RefDataLocation, Integer>{
	
}
>>>>>>> fe98613 Fixed Everything !!!!!
