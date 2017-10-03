package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDAO;
import com.dao.Impl.UserImple;
import com.model.User;


@Service("userService")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class UserServiceImpl implements UserService {

	
    @Autowired
    private UserDAO userDao=new UserImple();
	//@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)

	public void addUser(User user) {
		System.out.println("in service"+user.getUsername());
		userDao.createUser(user);
	}
	
	/*public List<User> listUsers() {
		return userDao.listUsers();
	}

	public User getUser(String username,String password) {
		return userDao.findUser(username, password);
	}*/


	/*public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}


	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}
	*/

    public UserImple userService() {
        return new UserImple();
    }


	public boolean checkLogin(String username, String password) {
		boolean p =userDao.findUser(username, password);
		return p;
	}
//	public void deleteUser(User user) {
//		userDao.deleteUser(user);
//	}

}
