package com.miaguilaweb.apps.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Location {
	private String type;
	private Double[] coordinates = new Double[2];
	
	public Location() {}
	
	public Location(String type,Double[] coordinates) {
		this.coordinates=coordinates;
		this.type = type;
	}
}
