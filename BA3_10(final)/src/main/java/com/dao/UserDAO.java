package com.dao;

import com.model.*;

//User Interface
public interface UserDAO 
{
	public void createUser(User user);
	public boolean findUser(String username,String password);

}
