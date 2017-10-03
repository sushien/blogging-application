package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDAO;
import com.dao.Impl.UserImple;
import com.model.User;

//Implementation of User Service
@Service("userService")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class UserServiceImpl implements UserService {

	//Autowire user bean
	@Autowired
	private UserDAO userDao=new UserImple();

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)

	//Create user
	public void addUser(User user) {
		System.out.println("in service"+user.getUsername());
		userDao.createUser(user);
	}

	
	public UserImple userService() {
		return new UserImple();
	}

	//Login for user
	public boolean checkLogin(String username, String password) {
		boolean p =userDao.findUser(username, password);
		return p;
	}

}
