package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/github")
public class GitHubUserController {
	
	/**
	 * Crea un usuario de GitHub y lo conecta con un usuario previamente creado a
	 * través de su ID.
	 * @param username
	 */
	
	@PostMapping("/{username}")
	public void createGitHubUser(@PathVariable String username) {
	}
}
