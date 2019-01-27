package com.miaguilaweb.apps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.miaguilaweb.apps.dto.CoordinateDto;
import com.miaguilaweb.apps.service.TravelService;

@RestController
public class ServiceController {

	@Autowired
	private TravelService travelService;
	
	@RequestMapping("/travelsAll")
	public String getTravels() {
		return travelService.findOne().toString();
	}
	
	@RequestMapping("/travelFields")
	public String getTravels2() {
		List<CoordinateDto> c = travelService.findAll();
		
		Gson gson = new Gson();
		
		return gson.toJson(c);
	}
}
