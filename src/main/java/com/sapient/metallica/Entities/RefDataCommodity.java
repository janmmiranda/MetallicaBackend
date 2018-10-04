package com.sapient.metallica.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="commodity")
public class RefDataCommodity {

	@Id
	String symbol;
	
	String name;

	public RefDataCommodity() {
		super();
	}

	public RefDataCommodity(String symbol, String name) {
		super();
		this.symbol = symbol;
		this.name = name;
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

	@Override
	public String toString() {
		return "RefDataCommodity [symbol=" + symbol + ", name=" + name + "]";
	}
	
	

}
