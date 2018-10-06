package com.sapient.metallica.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="MarketData")
@XmlRootElement
public class MDCommodity {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	int mdId;
	
	@ManyToOne
	RefDataCommodity commodity;
	
	float price;

	public RefDataCommodity getCommodity() {
		return commodity;
	}

	public void setCommodity(RefDataCommodity commodity) {
		this.commodity = commodity;
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
	
	public MDCommodity() {
		super();
	}
	
	public MDCommodity(RefDataCommodity commodity, float price) {
		this.commodity = commodity;
		this.price = price;
	}
	
}
