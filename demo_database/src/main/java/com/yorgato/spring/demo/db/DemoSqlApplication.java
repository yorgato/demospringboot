package com.yorgato.spring.demo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yorgato.spring.demo.db.repository.CriptoRepository;

@SpringBootApplication
public class DemoSqlApplication {

	@Autowired
	CriptoRepository criptoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSqlApplication.class, args);
		
	}

}
