package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.domain.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	 * Realiza un inicio de sesi�n.
	 * @return
	 */
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		return null;
	}
	
	/**
	 * Devuelve un mensaje de notificaci�n.
	 * @return
	 */
	
	@GetMapping("/notification")
	public String notification() {
		return null;
	}
	
}
