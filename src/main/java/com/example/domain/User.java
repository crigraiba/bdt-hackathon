package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Entity
@Table(name = "users")
@Document(collection = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@Field(name = "_id")
	private String id;

	@Column(name = "username")
	@Field(name = "username")
	private String username;
	@Column(name = "email")
	@Field(name = "email")
	private String email;
	@Column(name = "isEmailVerified")
	@Field(name = "isEmailVerified")
	private boolean isEmailVerified;
	@Column(name = "password")
	@Field(name = "password")
	private String password;

	@OneToOne(optional = false)
	@JoinColumn(name = "country_id", referencedColumnName = "id")
	private Country country;
	@OneToOne(optional = false)
	@JoinColumn(name = "gitHubUser_id", referencedColumnName = "id")
	private GitHubUser gitHubUser;
	@OneToOne(optional = false)
	@JoinColumn(name = "gitLabUser_id", referencedColumnName = "id")
	private GitLabUser gitLabUser;
	
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
	
	public void setCountry(Country country) {
		this.country = country;
	}
	
	public void setGitHubUser(GitHubUser gitHubUser) {
		this.gitHubUser = gitHubUser;
	}
	
	public void setGitLabUser(GitLabUser gitLabUser) {
		this.gitLabUser = gitLabUser;
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
	
	public Country getCountry() {
		return country;
	}
	
	public GitHubUser getGitHubUser() {
		return gitHubUser;
	}
	
	public GitLabUser getGitLabUser() {
		return gitLabUser;
	}
	
	// Otros métodos:
	@Override
	public String toString() {
		return "User[id="+ id + ", username=" + username + ", email=" + email + ", isEmailVerified" + isEmailVerified + ", password="
			+ password + ", country=" + country.toString() + ", gitHubUser=" + gitHubUser.toString() + ", gitLabUser=" + gitLabUser.toString() + "]";
	}
	
}
