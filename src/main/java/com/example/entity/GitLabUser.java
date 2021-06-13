package com.example.entity;

import org.springframework.data.annotation.Id;

public class GitLabUser {
	
	@Id
	private int id;
	
	private String username;
	private String url;
	private String[] repositories;
	private String[] repositoriesURL;
	
	// Método constructor:
	public GitLabUser() {
	}
	
	// Métodos setter:
	public void setId(int id) {
		this.id = id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	// Mètodos getter:
	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getUrl() {
		return url;
	}
	
}
