package com.service;

import com.model.User;

//User Service Implementation
public interface UserService {
	
	public void addUser(User user);
	public boolean checkLogin(String username, String password);
}
