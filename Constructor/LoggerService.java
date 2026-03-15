package com.example.Constructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import java.util.logging.Logger;
import java.util.logging.Level;

@Service
public class LoggerService {
	private static final Logger logger = Logger.getLogger(BookService.class.getName());

	public void log(String msg) 
	{
		logger.info(msg);
	}
}
