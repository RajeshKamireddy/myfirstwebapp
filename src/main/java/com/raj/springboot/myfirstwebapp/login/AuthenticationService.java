package com.raj.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username,String password) {
		
		boolean isValidUserName = username.equals("rajesh");
		boolean isValidPassword = password.equals("rajesh123");
		
		return isValidUserName && isValidPassword;	
	}

}
