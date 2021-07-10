package com.example.service;

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.domain.Country;

@Service
public class CountryService {
	
	// Lectura:
	/**
	 * Devuelve una lista de países.
	 * @return
	 * @throws IOException
	 */
	
	public ArrayList<Country> read() throws IOException {
		// Obtenemos los datos mediante una petición HTTP GET:
		
		URL url = new URL("https://restcountries.eu/rest/v2/all?fields=name;alpha2Code;alpha3Code;callingCodes");
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		String response = "";
		int responseCode = conn.getResponseCode();
		
		if (responseCode != 200)
			throw new RuntimeException();
		else {
			Scanner sc = new Scanner(url.openStream());
			
			while (sc.hasNext())
				response += sc.nextLine();
			
			sc.close();
		}
		
		// Transformamos los datos obtenidos en una lista:
		
		JSONArray jsonCountries = new JSONArray(response), jsonCallingCodes;
		JSONObject jsonCountry;
		
		ArrayList<Country> countries = new ArrayList<>();
		Country country;
		
		String[] callingCodes;
		
		for (int i = 0; i < jsonCountries.length(); i++) {
			jsonCountry = (JSONObject) jsonCountries.get(i);
			
			country = new Country();
			
			country.setId(i);
			country.setName(jsonCountry.getString("name"));
			country.setAlphaCodes(new String[] {jsonCountry.getString("alpha2Code"), jsonCountry.getString("alpha3Code")});
						
			jsonCallingCodes = jsonCountry.getJSONArray("callingCodes");
			callingCodes = new String[jsonCallingCodes.length()];
			
			for (int j = 0; j < jsonCallingCodes.length(); j++)
				callingCodes[j] = jsonCallingCodes.getString(j);
			
			country.setCallingCodes(callingCodes);
			
			countries.add(country);
		}
		
		return countries;
	}
	
}
