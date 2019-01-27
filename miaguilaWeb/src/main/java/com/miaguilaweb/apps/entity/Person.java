package com.miaguilaweb.apps.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {

	private String first_name;
	private String last_name;
	
	public Person() {}
	
	public Person (String first_name,String last_name) {
		this.first_name= first_name;
		this.last_name = last_name;
	}
}
