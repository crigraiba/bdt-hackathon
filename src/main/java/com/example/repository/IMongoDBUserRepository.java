package com.example.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.User;

@Repository
@Qualifier("mongodb-repository")
public interface IMongoDBUserRepository extends MongoRepository<User, String> {

	Optional<String> findGitHubUserIdById(String id);
	
	Optional<String> findGitLabUserIdById(String id);
	
}
