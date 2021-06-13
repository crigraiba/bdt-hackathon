package com.example.controller.exception;

public class UserNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public UserNotFoundException(String id) {
		super("User with ID " + id + " not found in database");
	}

}
