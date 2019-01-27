package com.miaguilaweb.apps.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {

	private String plate;
	
	
	public Car() {}
	
	public Car(String plate){
		this.plate = plate;
	}
}
