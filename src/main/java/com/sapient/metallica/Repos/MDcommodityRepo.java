package com.sapient.metallica.Repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import com.sapient.metallica.Entities.MDCommodity;
import com.sapient.metallica.Entities.RefDataCommodity;

@Repository
public class MDcommodityRepo {
	
	@PersistenceContext
	EntityManager em;


	MDCommodity mcd=new MDCommodity();
	
	public void setSymbolName(List<RefDataCommodity> List1) {
		
		for(int i=0;i<List1.size();i++) {
			mcd.setSymbol(List1.get(i).getSymbol());
			mcd.setName(List1.get(i).getName());
			
		}
	}
	
	public void add1(MDCommodity course) throws Exception {
			em.persist(course);
		
	}
	
	public MDCommodity findProductById(int id) {		
		return em.find(MDCommodity.class, id);
	}
	
		
	
	
	public void updateprice(List<RefDataCommodity> List1 ) {
		
		
	}
}

//public void setSymbol(String symbol) {
//	this.symbol = symbol;
//}
//public void setName(String name) {
//	this.name = name;
//}

