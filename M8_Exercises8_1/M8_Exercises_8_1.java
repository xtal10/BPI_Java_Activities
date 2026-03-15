package com.example.M8_Exercises8_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class M8_Exercises_8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BookController bookController = new BookController ();
		SpringApplication.run(M8_Exercises_8_1.class, args);
		bookController.getBooks();
	}

}
