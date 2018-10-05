package com.sapient.metallica.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class RefDataCounterParty {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String name;
	
	

	public RefDataCounterParty() {
		super();
	}



	public RefDataCounterParty(String name) {
		super();
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "RefDataCounterParty [id=" + id + ", name=" + name + "]";
	}
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;

	public RefDataCounterParty(String name) {
		super();
		this.name = name;
	}

	public RefDataCounterParty() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
