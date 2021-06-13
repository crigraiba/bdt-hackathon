package com.example.entity;

import org.springframework.data.annotation.Id;

public class GitHubUser {
	
	@Id
	private int id;
	
	private String username;
	private String url;
	private String[] repositories;
	private String[] repositoriesURL;
	
	// M�todo constructor:
	public GitHubUser() {
	}
	
	// M�todos setter:
	public void setId(int id) {
		this.id = id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	// M�todos getter:
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
