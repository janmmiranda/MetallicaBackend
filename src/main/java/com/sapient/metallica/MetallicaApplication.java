package com.sapient.metallica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sapient.metallica.helpers.MarketDataCreator;
import com.sapient.metallica.helpers.RefDataCreator;

@SpringBootApplication
public class MetallicaApplication {
	
	
	@Autowired
	static RefDataCreator creator;
	@Autowired
	static MarketDataCreator mdcreator;
	public static void main(String[] args) {
		SpringApplication.run(MetallicaApplication.class, args);
		creator.createRefData();
		mdcreator.setData();
	}
	
}
