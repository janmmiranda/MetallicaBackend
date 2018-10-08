package com.sapient.metallica.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="market_data")
@XmlRootElement
public class MDCommodity {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	int mdId;
	
	float price;
	String symbol;
	String name;
	
	public MDCommodity() {
		super();
	}
	
	public MDCommodity(float price, String symbol, String name) {
	super();
	this.price = price;
	this.symbol = symbol;
	this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getMdId() {
		return mdId;
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
		return "MDCommodity [mdId=" + mdId + ", price=" + price + ", symbol=" + symbol + ", name=" + name + "]";
	}
	
}
