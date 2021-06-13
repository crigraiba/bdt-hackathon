package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.User;

public class GlobalRestController {
	
	@PostMapping("/register")
	public void register(@RequestBody User user) {
	}
	
	@GetMapping("/login")
	public String login() {
		return null;
	}
	
	@GetMapping("/notification")
	public String notification() {
		return null;
	}
	
}
