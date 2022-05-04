package com.example.springsecurityproject.response;

import java.util.List;

public class JwtResponse {
	private String token;
	private String type = "Bearer";

	public JwtResponse(String accessToken) {
		this.token = accessToken;
	}

	public JwtResponse(String jwt, Long id, String username, String email, List<String> roles) {
		this.token = jwt;

	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}


}
