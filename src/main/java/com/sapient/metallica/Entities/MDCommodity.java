package com.sapient.metallica.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQuery;
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

	float price=getRandomNumber();// random price
	String symbol;
	String name;
	
//	@Autowired
//	RefDataCommodityRepo jpaCMD;
//	
//	@RequestMapping(path="/allproduct", method=RequestMethod.GET)
//	public List<RefDataCommodity> findAllCMD(){
//		List<RefDataCommodity> List1 = jpaCMD.findAll();
//				return List1;
//	}
	

	
//	@ManyToOne
//	RefDataCommodity commodity;

	

	public RefDataCommodity getCommodity() {
		return commodity;
	}

	public void setCommodity(RefDataCommodity commodity) {
		this.commodity = commodity;
	}

	public MDCommodity() {
		super();
	}
	
	public MDCommodity(String symbol, String name) {
		super();
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


	public static float getRandomNumber(){
	    float x = (float)(Math.random() * 5000 + 500);//price range between 500 to 5000
	    return x;
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
	
	 
//	public RefDataCommodity getCommodity() {
//		return commodity;
//	}
//
//	public void setCommodity(RefDataCommodity commodity) {
//		this.commodity = commodity;
//	}

	
	
	
	public MDCommodity(RefDataCommodity commodity, float price) {
		this.commodity = commodity;
		this.price = price;
	}
	
}
