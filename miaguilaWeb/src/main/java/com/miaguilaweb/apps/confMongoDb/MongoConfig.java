package com.miaguilaweb.apps.confMongoDb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration{

	@Override
	public MongoClient mongoClient() {
		// TODO Auto-generated method stub
		return new MongoClient("127.0.0.1", 27017);
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return "miaguila";
	}
	
	@Override
    protected String getMappingBasePackage() {
        return "com.example.apps.confMongodb";
    }

}
