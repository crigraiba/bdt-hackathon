package com.example.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.User;

@Repository
public interface IPostgreSQLUserRepository extends JpaRepository<User, String> {
	
	Optional<String> findGitHubUserIdById(String id);
	
	Optional<String> findGitLabUserIdById(String id);
	
}
