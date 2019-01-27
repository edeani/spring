package com.miaguilaweb.apps.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContentName {

	private String name;
	
	public ContentName() {
		
	}
	
	public ContentName(String name) {
		this.name = name;
	}
}
