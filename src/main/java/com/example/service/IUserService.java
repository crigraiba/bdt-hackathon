package com.example.service;

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.util.Scanner;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.domain.User;

@Service
public interface IUserService {
	
	// Lectura:
	Optional<User> readById(String id);
	
	// Creación:
	void create(User user);
	
	// Actualización:
	void update(User user);
	
	// Eliminación:
	void deleteById(String id);
	
	// Lectura:
	Optional<String> readGitHubUserIdById(String id);

	Optional<String> readGitLabUserIdById(String id);
	
	/** TASK3
	 * Verifica el correo electrónico de un usuario comprobando tanto si el formato
	 * es válido como si el dominio tiene un servidor existente asignado.
	 * @param email
	 * @return
	 * @throws IOException
	 */
	
	default boolean isEmailVerified(String email) throws IOException {
		// Obtenemos los datos mediante una petición HTTP GET:
		
		String accessKey = System.getenv().get("ACCESS_TOKEN");
		
		URL url = new URL("https://apilayer.net/api/check?access_key=" + accessKey + "&email=" + email + "&smtp=1&format=1");
		
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
		
		// Transformamos los datos obtenidos en un boolean:
		
		JSONObject jsonEmail = new JSONObject(response);
		
		boolean formatValid, smtpCheck;
		
		formatValid = jsonEmail.getBoolean("format_valid"); // Syntax Check
		smtpCheck = jsonEmail.getBoolean("smtp_check"); // Real-time Verification
		
		if (formatValid && smtpCheck)
			return true;
		else
			return false;
	}
	
}
