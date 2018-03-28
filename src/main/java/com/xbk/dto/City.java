package com.xbk.dto;

public class City {
	
	private String id;
	
	private String postcode;
	
	private String name;

	public City(String id, String postcode, String name) {
		super();
		this.id = id;
		this.postcode = postcode;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
