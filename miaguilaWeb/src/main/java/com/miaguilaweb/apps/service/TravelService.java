package com.miaguilaweb.apps.service;



import java.util.List;

import com.miaguilaweb.apps.dto.CoordinateDto;
import com.miaguilaweb.apps.entity.Travel;

public interface TravelService {

	public Travel findOne();
	
	List<CoordinateDto> findAll();
}
