package com.finance_app.finance_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeAll;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootTest
class FinanceAppApplicationTests {

   @BeforeAll
   static void setup() {
      Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load(); // Ignore if .env is missing
      System.setProperty("APP_NAME", dotenv.get("APP_NAME", "finance-app"));
      System.setProperty("DB_URL", dotenv.get("DB_URL", "jdbc:mysql://junction.proxy.rlwy.net:32317/railway"));
      System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME", "root"));
      System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD", "EfeoKzJDqRRGwyiAkNgCmKLknrkANwxp"));
      System.setProperty("DB_DRIVER", dotenv.get("DB_DRIVER", "com.mysql.cj.jdbc.Driver"));
      System.setProperty("DB_DIALECT", dotenv.get("DB_DIALECT", "org.hibernate.dialect.MySQLDialect"));
      System.setProperty("JPA_DDL_AUTO", dotenv.get("JPA_DDL_AUTO", "update"));
      System.setProperty("JPA_SHOW_SQL", dotenv.get("JPA_SHOW_SQL", "true"));
      System.setProperty("SERVER_PORT", dotenv.get("SERVER_PORT", "8080"));
   }

   @Test
   void contextLoads() {
      // Test logic here
   }
}
