package com.example.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.domain.User;
import com.example.repository.mongo.IMongoDBUserRepository;

@Service
public class MongoDBUserService implements IUserService {
	
	@Autowired(required = false)
	IMongoDBUserRepository repository;
	
	public MongoDBUserService() {
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
	
	// Creaci�n:
	@Override
	public void create(User user) {
		repository.save(user);
	}
	
	// Actualizaci�n:
	@Override
	public void update(User user) {
		repository.save(user);
	}

	// Eliminaci�n:
	@Override
	public void deleteById(String id) {
		repository.deleteById(id);
	}
	
}
