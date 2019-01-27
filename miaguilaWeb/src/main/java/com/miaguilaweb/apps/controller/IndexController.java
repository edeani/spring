package com.miaguilaweb.apps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.google.gson.Gson;
import com.miaguilaweb.apps.entity.ContentName;
import com.miaguilaweb.apps.entity.Travel;
import com.miaguilaweb.apps.service.TravelService;

@Controller
public class IndexController {
	
	@Autowired
	private TravelService travelService;
	
	@GetMapping("/home")
	public String index(Model model){
		
		return "mapa";
	}
	
	@MessageMapping("/mensaje")
	@SendTo("/ws/travels")
	public String testWebSocket(ContentName mensaje) throws Exception {
		 Thread.sleep(1000); // simulated delay
		 
		 Travel travel = travelService.findOne();
		 
		 Gson gson = new Gson();
		 
		 return gson.toJson(travel);
	}
}
