package com.example.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.User;
import com.example.repository.IPostgreSQLUserRepository;

@Service
public class PostgreSQLUserService implements IUserService {

	//@Autowired
	IPostgreSQLUserRepository repository;
	
	public PostgreSQLUserService() {
	}
	
	// Lectura:
	@Override
	public Optional<User> readById(String id) {
		return null;
	}
	
	// Creaci�n:
	@Override
	public void create(User user) {
	}
	
	// Actualizaci�n:
	@Override
	public void update(User user) {
	}
	
	// Eliminaci�n:
	@Override
	public void deleteById(String id) {
	}
	
	// Lectura:
	@Override
	public Optional<String> readGitHubUserIdById(String id) {
		return null;
	}

	@Override
	public Optional<String> readGitLabUserIdById(String id) {
		return null;
	}

}
