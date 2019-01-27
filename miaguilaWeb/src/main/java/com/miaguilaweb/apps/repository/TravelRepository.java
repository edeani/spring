package com.miaguilaweb.apps.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miaguilaweb.apps.entity.Travel;

public interface TravelRepository extends MongoRepository<Travel, String>{

}
