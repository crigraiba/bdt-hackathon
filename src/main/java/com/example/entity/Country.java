package com.example.entity;

import org.springframework.data.annotation.Id;

public class Country {
	
	@Id
	private int id;
	
	private String name;
	private String[] alphaCode;
	private String[] callingCodes;
	
	// M�todo constructor:
	public Country() {
	}
	
	// M�todos setter:
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAlphaCode(String[] alphaCode) {
		this.alphaCode = alphaCode;
	}
	
	public void setCallingCodes(String[] callingCodes2) {
		this.callingCodes = callingCodes2;
	}
	
	// M�todos getter:
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getAlphaCode() {
		return alphaCode;
	}
	
	public String[] getCallingCodes() {
		return callingCodes;
	}
	
}
