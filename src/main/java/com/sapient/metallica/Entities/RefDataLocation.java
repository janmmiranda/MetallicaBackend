package com.sapient.metallica.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class RefDataLocation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String cityname;
	
	
	public RefDataLocation() {
		super();
	}



	public RefDataLocation(String cityname) {
		super();
		this.cityname = cityname;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCityname() {
		return cityname;
	}



	public void setCityname(String cityname) {
		this.cityname = cityname;
	}



	@Override
	public String toString() {
		return "RefDataLocation [id=" + id + ", cityname=" + cityname + "]";
	}
	
}
