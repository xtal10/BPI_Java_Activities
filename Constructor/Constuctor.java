package com.example.Constructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Constuctor {

	static BookService bookService = new BookService();
	public static void main(String[] args) {
		SpringApplication.run(Constuctor.class, args);
//		System.out.print("Sample Springboot Program.");
		bookService.userLog();
		
	}
	

}
