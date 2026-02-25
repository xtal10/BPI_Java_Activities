package com.example.SetterInjector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SetterInjector {

	static BookService bookService = new BookService();
	public static void main(String[] args) {
		SpringApplication.run(SetterInjector.class, args);
//		System.out.print("Sample Springboot Program.");
		bookService.userLog();
		
	}
	

}
