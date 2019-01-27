package com.miaguilaweb.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.miaguilaweb.apps.repository")
public class MiaguilaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiaguilaWebApplication.class, args);
	}

}

