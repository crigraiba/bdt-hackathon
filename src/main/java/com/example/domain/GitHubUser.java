package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Entity
@Table(name = "gitHubUsers")
@Document(collection = "gitHubUsers")
public class GitHubUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Field(name = "_id")
	private int id;

	@Column(name = "username")
	@Field(name = "username")
	private String username;
	@Column(name = "url")
	@Field(name = "url")
	private String url;
	@Column(name = "repositoriesUrl")
	@Field(name = "repositoriesUrl")
	private String repositoriesUrl;
	@Column(name = "repositories")
	@Field(name = "repositories")
	private String[] repositories;
	
	// Método constructor:
	public GitHubUser() {
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
	
	// Otros métodos:
	@Override
	public String toString() {
		return "GitHubUser[id=" + id + ", username=" + username + ", url=" + url + ", repositoriesUrl=" + repositoriesUrl + ", repositories=" + repositories + "]";
	}
	
}
