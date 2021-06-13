package com.example.controller.exception;

public class GitLabUserNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public GitLabUserNotFoundException(String id) {
		super("GitLab user of user with ID " + id + " not found in database");
	}

}
