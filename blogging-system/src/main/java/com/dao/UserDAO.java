package com.BloggingApplication.DAO;
import com.BloggingApplication.model.*;


public interface UserDAO {
	
	public void createUser(User user);
	public boolean findUser(String username,String password);

}
