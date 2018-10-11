package com.sapient.metallica.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class RefDataCommodity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
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

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "RefDataCommodity [id=" + id + ", symbol=" + symbol + ", name=" + name + "]";
	}
	
}
