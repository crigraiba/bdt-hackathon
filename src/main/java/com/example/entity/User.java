package com.example.entity;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private String id;
	
	private String username;
	private String email;
	private boolean isEmailVerified;
	private String password;
	
	private String countryId;
	private String gitHubUserId;
	private String gitLabUserId;
	
	// Método constructor:
	public User() {
	}
	
	// Métodos setter:
	public void setId(String id) {
		this.id = id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setIsEmailVerified(boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	
	public void setGitHubUserId(String gitHubUserId) {
		this.gitHubUserId = gitHubUserId;
	}
	
	public void setGitLabUserId(String gitLabUserId) {
		this.gitLabUserId = gitLabUserId;
	}
	
	// Métodos getter:
	public String getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public boolean getIsEmailVerified() {
		return isEmailVerified;
	}

	public String getPassword() {
		return password;
	}
	
	public String getCountryId() {
		return countryId;
	}
	
	public String getGitHubUserId() {
		return gitHubUserId;
	}
	
	public String getGitLabUserId() {
		return gitLabUserId;
	}
	
	// Otros métodos:
	@Override
	public String toString() {
		return "User[id="+ id + ", username=" + username + ", email=" + email + ", isEmailVerified" + isEmailVerified + ", password="
			+ password + ", countryId=" + countryId + ", gitHubUserId=" + gitHubUserId + ", gitLabUserId=" + gitLabUserId + "]";
	}
	
}
