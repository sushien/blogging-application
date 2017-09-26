package com.tests;

import java.util.Date;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.dao.UserDAO;
import com.dao.Impl.UserImple;
import com.model.User;
import com.mysql.jdbc.Blob;

public class UserTest 
{
	public static void main(String[] args) 
	{
		
		User user1=new User();
		user1.setUsername("rasiakd");
		user1.setPassword("12345");
		user1.setUserType("user");
		user1.setEmailId("rasikad@gmail.com");
		UserDAO dd=new UserImple();
		
		dd.createUser(user1);
		System.out.println("obj inserted");
		
		boolean uf=dd.findUser("rasiakd","12345");
		if(uf)
		{
			System.out.println("valid user");
			
		}
		else
			System.out.println("invalid user");
	}
}