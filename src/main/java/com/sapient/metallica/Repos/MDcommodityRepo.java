package com.sapient.metallica.Repos;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.sapient.metallica.Entities.MDCommodity;
import com.sapient.metallica.Entities.RefDataCommodity;

@Repository
public class MDcommodityRepo {

	MDCommodity mcd=new MDCommodity();
	
	public void setSymbolName(List<RefDataCommodity> List1) {
		
		for(int i=0;i<List1.size();i++) {
			mcd.setSymbol(List1.get(i).getSymbol());
			mcd.setName(List1.get(i).getName());
			
		}
		
		
	}
}

//public void setSymbol(String symbol) {
//	this.symbol = symbol;
//}
//public void setName(String name) {
//	this.name = name;
//}

