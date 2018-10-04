package com.sapient.metallica.Entities;

<<<<<<< Upstream, based on origin/Lalit
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
=======

>>>>>>> d279346 Created MDCommodity entity, Notification package and class, added all delete and update for Trade Controller and commented out certain attributes from TradeEntity
public class RefDataCommodity {

	@Id
	private String symbol;
	private String name;
	
	public RefDataCommodity(String symbol, String name) {
		super();
		this.symbol = symbol;
		this.name = name;
	}

	public RefDataCommodity() {
		super();
	}


	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
