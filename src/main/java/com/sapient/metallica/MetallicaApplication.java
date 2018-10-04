package com.sapient.metallica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sapient.metallica.helpers.RefDataCreator;

@SpringBootApplication
public class MetallicaApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(MetallicaApplication.class, args);
		
		RefDataCreator creator = new RefDataCreator();
		creator.createRefData();
	}
}
