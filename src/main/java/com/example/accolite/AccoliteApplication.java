package com.example.accolite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.accolite.model.logIn;

@SpringBootApplication
public class AccoliteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccoliteApplication.class, args);
		System.out.println("hello world");
		

}
}
