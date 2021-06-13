package com.example.entity;

import org.springframework.data.annotation.Id;

public class GitLabUser {
	
	@Id
	private int id;
	
	private String username;
	private String url;
	private String repositoriesUrl;
	private String[] repositories;
	
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
	
	public void setRepositoriesUrl(String repositoriesUrl) {
		this.repositoriesUrl = repositoriesUrl;
	}
	
	public void setRepositories(String[] repositories) {
		this.repositories = repositories;
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
	
	public String getRepositoriesUrl() {
		return repositoriesUrl;
	}
	
	public String[] getRepositories() {
		return repositories;
	}
	
}
