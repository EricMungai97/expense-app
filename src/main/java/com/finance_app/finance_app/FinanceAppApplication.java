package com.finance_app.finance_app;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanceAppApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		// Set the environment variables
		System.setProperty("APP_NAME", dotenv.get("APP_NAME"));
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		System.setProperty("DB_DRIVER", dotenv.get("DB_DRIVER"));
		System.setProperty("DB_DIALECT", dotenv.get("DB_DIALECT"));
		System.setProperty("JPA_DDL_AUTO", dotenv.get("JPA_DDL_AUTO"));
		System.setProperty("JPA_SHOW_SQL", dotenv.get("JPA_SHOW_SQL"));
		System.setProperty("SERVER_PORT", dotenv.get("SERVER_PORT"));
		SpringApplication.run(FinanceAppApplication.class, args);
	}

}
