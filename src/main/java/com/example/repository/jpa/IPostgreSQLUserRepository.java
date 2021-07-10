package com.example.repository.jpa;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface IPostgreSQLUserRepository extends JpaRepository<User, String> {
	
	Optional<String> findGitHubUserIdById(String id);
	
	Optional<String> findGitLabUserIdById(String id);
	
}
