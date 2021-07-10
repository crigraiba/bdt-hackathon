package com.example.repository.mongo;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface IMongoDBUserRepository extends MongoRepository<User, String> {

	Optional<String> findGitHubUserIdById(String id);
	
	Optional<String> findGitLabUserIdById(String id);
	
}
