package com.miaguilaweb.apps.dto;

import lombok.ToString;

@ToString
public class CoordinateDto {

	//private Integer index;
	private Double[] coord = new Double[2];
	
	
	public CoordinateDto() {
		
	}
	
	public CoordinateDto(Double[] coord) {
		this.coord=coord;
		//this.index=index;
	}

	/*public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}*/

	public Double[] getCoord() {
		return coord;
	}

	public void setCoord(Double[] coord) {
		this.coord = coord;
	}
	
	
	
}
