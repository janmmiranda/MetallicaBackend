package com.sapient.metallica.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RefDataLocation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String cityName;
	
	public RefDataLocation(String cityName) {
		super();
		this.cityName = cityName;
	}

	public RefDataLocation() {
		super();
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
