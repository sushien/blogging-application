package com.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDAO;
import com.model.User;

//Implementation of UserDAO
@Repository("userDao")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class UserImple implements UserDAO {

	@Autowired
	private SessionFactory mysession;

	//Add user to database
	public void createUser(User user) {
		Session session=mysession.getCurrentSession();
		session.save(user);
		System.out.println("in imple"+user.getUsername());
	}

	//search user in database
	public boolean findUser(String username,String password) {
		// TODO Auto-generated method stub
		Session session=mysession.getCurrentSession();
		boolean userFound = false;
		//Query using Hibernate Query Language
		String SQL_QUERY =" from User as o where o.username=? and o.password=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,username);
		query.setParameter(1,password);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}
		return userFound;    	
	}

}
