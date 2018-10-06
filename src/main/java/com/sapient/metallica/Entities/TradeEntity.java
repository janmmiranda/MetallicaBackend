package com.sapient.metallica.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Trade")
@XmlRootElement
public class TradeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int tradeId;
	
	/*
	 * True  Buy
	 * False Sell
	 */
	Boolean side;
	/*
	 * True  Completed
	 * False Open
	 */
	Boolean status;
	
	int quantity;
	float price;
	@Column(name="trade_date")
	@Temporal(TemporalType.DATE)
	Date date;
	
	@ManyToOne
	RefDataCommodity commodity;
	@ManyToOne
	RefDataCounterParty counterParty;
	@ManyToOne
	RefDataLocation location;
	
	public Boolean getSide() {
		return side;
	}
	public void setSide(Boolean side) {
		this.side = side;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public RefDataCommodity getCommodity() {
		return commodity;
	}
	public void setCommodity(RefDataCommodity commodity) {
		this.commodity = commodity;
	}
	public RefDataCounterParty getCounterParty() {
		return counterParty;
	}
	public void setCounterParty(RefDataCounterParty counterParty) {
		this.counterParty = counterParty;
	}
	public RefDataLocation getLocation() {
		return location;
	}
	public void setLocation(RefDataLocation location) {
		this.location = location;
	}
	public int getTradeId() {
		return tradeId;
	}
	
	public TradeEntity() {
		super();
	}
	
	public TradeEntity(Boolean side, int quantity, float price, Date date) {
		this.side = side;
		this.status = false;
		this.quantity = quantity;
		this.price = price;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "TradeEntity [tradeId=" + tradeId + ", side=" + side + ", status=" + status + ", quantity=" + quantity
				+ ", price=" + price + ", date=" + date + ", commodity=" + commodity + ", counterParty=" + counterParty
				+ ", location=" + location + "]";
	}
	
	
}
