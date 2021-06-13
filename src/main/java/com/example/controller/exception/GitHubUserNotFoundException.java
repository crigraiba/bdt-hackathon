package com.example.controller.exception;

public class GitHubUserNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public GitHubUserNotFoundException(String id) {
		super("GitHub user of user with ID " + id + " not found in database");
	}
	
}
