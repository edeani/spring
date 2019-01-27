package com.miaguilaweb.apps.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="travels")
public class Travel {

	@Id
	private String id;
	
	private StartEnd start;
	private StartEnd end;
	
	private ContentName country;
	private ContentName city;
	
	private Person passenger;
	private Person driver;
	
	private Car car;
	
	private String status;
	private String check_code;
	
	private Date createdAt;
	private Date updatedAt;
	
	private Float price;
	private Location driver_location;
	
	public Travel() {}
	
	public Travel(String id,StartEnd start,StartEnd end,ContentName country, ContentName city,
			Person passenger,Person driver, Car car,String status,String check_code,
			Date createdAt, Date updatedAt,Float price,Location driver_location) {
		
		this.id=id;
		this.start=start;
		this.end=end;
		this.country=country;
		this.city=city;
		this.passenger=passenger;
		this.driver=driver;
		this.car=car;
		this.status = status;
		this.check_code=check_code;
		this.createdAt=createdAt;
		this.updatedAt=updatedAt;
		this.price=price;
		this.driver_location=driver_location;
	}
}
