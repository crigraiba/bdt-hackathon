package com.example.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.domain.GitHubUser;

@Service
public class GitLabUserService {
	
	// Creación:
	public void create(String username) throws IOException {
		// Obtenemos los datos mediante una petición HTTP GET:
		
		URL url = new URL("https://gitlab.com/api/v4/users?username=" + username);
		
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
		
		GitHubUser gitLabUser = new GitHubUser();
		
		gitLabUser.setUsername(username);
		
		gitLabUser.setId(jsonGitHubUser.getInt("id"));
		gitLabUser.setUrl(jsonGitHubUser.getString("web_url"));
		//gitLabUser.setRepositoriesUrl(jsonGitHubUser.getString("repos_url"));
		//gitLabUser.setRepositories(jsonGitHubUser.getString(""));
		
		System.out.println(gitLabUser.toString());
	}
	
}
