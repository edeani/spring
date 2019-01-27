package com.miaguilaweb.apps.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StartEnd {

	private Date date;
	private String pickup_addres;
	private Location pickup_location;
	
	public StartEnd() {}
	
	public StartEnd(Date date,String pickup_addres,Location pickup_location) {
		this.date=date;
		this.pickup_addres=pickup_addres;
		this.pickup_location=pickup_location;
	}
}
