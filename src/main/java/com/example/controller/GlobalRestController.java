package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.User;

public class GlobalRestController {
	
	/**
	 * Registra al usuario.
	 * @param user
	 */
	
	@PostMapping("/register")
	public void register(@RequestBody User user) {
		//isEmailVerified
	}
	
	/**
	 * Realiza un inicio de sesión.
	 * @return
	 */
	
	@GetMapping("/login")
	public String login(@RequestBody User user) {
		return null;
	}
	
	/**
	 * Devuelve un mensaje de notificación.
	 * @return
	 */
	
	@GetMapping("/notification")
	public String notification() {
		return null;
	}
	
}
