package com.example.service;

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.entity.GitHubUser;

@Service
public class GitHubUserService {
	
	// Creación:
	public void create(String username) throws IOException {
		// Obtenemos los datos mediante una petición HTTP GET:
		
		URL url = new URL("https://api.github.com/users/" + username);
		
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
		
		// Transformamos los datos obtenidos en un objeto:
		
		JSONObject jsonGitHubUser = new JSONObject(response);
		
		GitHubUser gitHubUser = new GitHubUser();
		
		gitHubUser.setUsername(username);
		
		gitHubUser.setId(jsonGitHubUser.getInt("id"));
		gitHubUser.setUrl(jsonGitHubUser.getString("url"));
		gitHubUser.setRepositoriesUrl(jsonGitHubUser.getString("repos_url"));
		//gitHubUser.setRepositories(jsonGitHubUser.getString(""));
	}
	
}
