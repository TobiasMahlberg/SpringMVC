package com.tmahlberg.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String username, String password) {
		return username.equalsIgnoreCase("admin") && password.equals("admin");
	}

}