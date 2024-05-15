package com.jopisoft.unleashed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jopisoft.unleashed", "com.jopisoft.unleashed.*"})
public class UnleashedApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnleashedApplication.class, args);

	}

}
