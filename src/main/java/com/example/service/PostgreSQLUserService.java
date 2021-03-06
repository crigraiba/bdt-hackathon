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
		return repository.findById(id);
	}
	
	@Override
	public Optional<String> readGitHubUserIdById(String id) {
		return repository.findGitHubUserIdById(id);
	}

	@Override
	public Optional<String> readGitLabUserIdById(String id) {
		return repository.findGitLabUserIdById(id);
	}
	
	// Creación:
	@Override
	public void create(User user) {
		repository.save(user);
	}
	
	// Actualización:
	@Override
	public void update(User user) {
		repository.save(user);
	}
	
	// Eliminación:
	@Override
	public void deleteById(String id) {
		repository.deleteById(id);
	}

}
