package com.example.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Country;
import com.example.service.CountryService;

@RestController
public class CountryRestController {
	
	@Autowired
	CountryService service;
	
	/**
	 * Devuelve una lista de países.
	 * @return
	 * @throws IOException 
	 */
	
	@GetMapping("/countries")
	public ArrayList<Country> readCountries() throws IOException {
		return service.read();
	}
	
}
