package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.example.service.MongoDBUserService;
import com.example.controller.exception.UserNotFoundException;
import com.example.domain.GitHubUser;
import com.example.domain.GitLabUser;
import com.example.domain.User;
import com.example.controller.exception.GitHubUserNotFoundException;
import com.example.controller.exception.GitLabUserNotFoundException;

@RestController
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	MongoDBUserService service;
	//PostgreSQLUserService service;
		
	// Lectura:
	/**
	 * Devuelve un usuario a través de su ID.
	 * @param id
	 * @return User
	 */
	
	@GetMapping("/{id}")
	public User readById(@PathVariable String id) {
		return service.readById(id).orElseThrow(() -> new UserNotFoundException(id));
	}
	
	// Creación:
	/**
	 * Crea un usuario.
	 * @param user
	 */
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@RequestBody User user) {
		service.create(user);
	}
	
	// Actualización:
	/**
	 * Actualiza un usuario a través de su ID.
	 * @param id
	 * @param user
	 */
	
	@PutMapping("/{id}")
	public void update(@PathVariable String id, @RequestBody User user) {
		// Comprobamos que el usuario exista:
		this.readById(id);
		
		user.setId(id);
		service.update(user);
	}
	
	// Eliminación:
	/**
	 * Borra un usuario a través de su ID.
	 * @param id
	 */
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		// Comprobamos que el usuario exista:
		this.readById(id);
		
		service.deleteById(id);
	}
	
	// Lectura:
	/**
	 * Devuelve el usuario de GitHub asociado a un usuario a través del
	 * ID del usuario.
	 * @param id
	 * @return
	 */
	
	@GetMapping("/{id}/github")
	public GitHubUser readGitHubUserById(@PathVariable String id) {
		// Comprobamos que el usuario exista:
		this.readById(id);
		
		service.readGitHubUserIdById(id).orElseThrow(() -> new GitHubUserNotFoundException(id));
		
		return null;
	}

	/**
	 * Devuelve el usuario de GitLab asociado a un usuario a través del
	 * ID del usuario.
	 * @param id
	 * @return
	 */
	
	@GetMapping("/{id}/gitlab")
	public GitLabUser readGitLabUserById(@PathVariable String id) {
		// Comprobamos que el usuario exista:
		this.readById(id);
		
		service.readGitLabUserIdById(id).orElseThrow(() -> new GitLabUserNotFoundException(id));
		
		return null;
	}
	
}
