package com.dao;
import com.model.User;

public interface UserDAO 
{	
	public void createUser(User user);
	public boolean findUser(String username,String password);
}
