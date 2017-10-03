package com.service;

import java.util.List;

import com.model.User;



/**
 * @author Dinesh Rajput
 *
 */
public interface UserService {
	
	public void addUser(User user);

	//public List<User> listUsers();
	
	//public User getUser(String username);
	
	//public void deleteUser(User user);
	public boolean checkLogin(String username, String password);
}
