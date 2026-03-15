package com.example.FieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;


@Service
public class BookService {
	LoggerService loggerService2 = new LoggerService();
	
	
	
	@Autowired
	private LoggerService loggerService;
	
	public void userLog() {
		
		loggerService2.log("This is Field Injection!");
	}

}
