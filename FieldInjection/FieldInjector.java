package com.example.FieldInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FieldInjector {

	static BookService bookService = new BookService();
	public static void main(String[] args) {
		SpringApplication.run(FieldInjector.class, args);
//		System.out.print("Sample Springboot Program.");
		bookService.userLog();
		
	}
	

}
