package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Entity
@Table(name = "countries")
@Document(collection = "countries")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Field(name = "_id")
	private int id;

	@Column(name = "name")
	@Field(name = "name")
	private String name;
	@Column(name = "alphaCodes")
	@Field(name = "alphaCodes")
	private String[] alphaCodes;
	@Column(name = "callingCodes")
	@Field(name = "callingCodes")
	private String[] callingCodes;
	
	// Método constructor:
	public Country() {
	}
	
	// Métodos setter:
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAlphaCodes(String[] alphaCodes) {
		this.alphaCodes = alphaCodes;
	}
	
	public void setCallingCodes(String[] callingCodes2) {
		this.callingCodes = callingCodes2;
	}
	
	// Métodos getter:
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getAlphaCodes() {
		return alphaCodes;
	}
	
	public String[] getCallingCodes() {
		return callingCodes;
	}
	
}
