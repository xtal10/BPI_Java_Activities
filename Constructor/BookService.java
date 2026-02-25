package com.example.Constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;


@Component
public class BookService {
	LoggerService loggerService2 = new LoggerService();
	
	private final LoggerService loggerService;
	
	// Constructor Injection
	public BookService(LoggerService loggerService) 
	{
		this.loggerService=loggerService;
	}
	
	public BookService() {
		this.loggerService = new LoggerService();
		// TODO Auto-generated constructor stub
	}

	public void userLog() {
		
		loggerService2.log("This is Constructor based!");
	}

}
