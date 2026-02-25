package com.example.SetterInjector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;


@Service
public class BookService {
	LoggerService loggerService2 = new LoggerService();
	
	private LoggerService loggerService;
	
	@Autowired
	public void setLoggerService(LoggerService loggerService) 
	{
		this.loggerService=loggerService;
	}
	
	public void userLog() {
		
		loggerService2.log("This is Setter Injection!");
	}

}
