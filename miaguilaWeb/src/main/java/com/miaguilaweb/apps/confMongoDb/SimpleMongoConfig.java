package com.miaguilaweb.apps.confMongoDb;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

//@Configuration
public class SimpleMongoConfig {
	
	@Bean
	public MongoClient mongo() {
		return new MongoClient("localhost");
	}
	
	@Bean
	public MongoTemplate mongoTemplate() throws IOException{
		 return new MongoTemplate(mongo(), "miaguila");
	}
	
}
