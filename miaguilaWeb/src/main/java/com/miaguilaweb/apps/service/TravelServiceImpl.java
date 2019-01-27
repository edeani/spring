package com.miaguilaweb.apps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miaguilaweb.apps.dto.CoordinateDto;
import com.miaguilaweb.apps.entity.Travel;
import com.miaguilaweb.apps.repository.TravelRepository;

@Service
public class TravelServiceImpl implements TravelService{

	@Autowired
	private MongoTemplate mongoTemplate;

	@Autowired
	private TravelRepository travelRepository;


	@Transactional(readOnly=true)
	@Override
	public Travel findOne() {
		Travel travel = mongoTemplate.findOne(Query.query(Criteria.where("check_code").is("19")), Travel.class);
		
		
		
		return travel;
	}



	@Transactional(readOnly=true)
	@Override
	public List<CoordinateDto> findAll() {
		Query query = new Query();
		//query.fields().include("driver_location.coordinates");
		query.addCriteria(Criteria.where("check_code").is("19"));
		
		List<CoordinateDto> c = mongoTemplate.find(query,CoordinateDto.class);
		
		return c;
	}
}
