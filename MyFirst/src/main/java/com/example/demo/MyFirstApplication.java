package com.example.demo;

import com.example.demo.entities.Feature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstApplication {

	public static void main(String[] args) {
		// added text 
		SpringApplication.run(MyFirstApplication.class, args);
		Feature myfeature = new Feature();
		myfeature.setTitle("hello");
		
		
	}

}
