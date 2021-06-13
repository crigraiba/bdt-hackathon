package com.example.controller;

import com.example.service.GitHubUserService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;

@RestController
@RequestMapping("/github")
public class GitHubUserController {
	
	@Autowired
	GitHubUserService service;
	
	// Creaci�n:
	/**
	 * Crea un usuario de GitHub a trav�s de su nombre de usuario y lo conecta con un usuario
	 * previamente creado usando su ID como clave for�nea.
	 * @param username
	 * @throws IOException 
	 */
	
	@PostMapping("/{username}")
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@PathVariable String username) throws IOException {
		service.create(username);
	}
	
}
