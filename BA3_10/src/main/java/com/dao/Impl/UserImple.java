package com.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.dao.UserDAO;
import com.model.User;
//import com.utility.MyUtil;


@Repository("userDao")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)

public class UserImple implements UserDAO {


	//private Session session;

	@Autowired
	private SessionFactory factory;


	public void createUser(User user) {
		// TODO Auto-generated method stub
		Session session=factory.getCurrentSession();
		session.save(user);
		System.out.println("in imple"+user.getUsername());
        //session.beginTransaction().commit();
	}


	public boolean findUser(String username,String password) {
		// TODO Auto-generated method stub
		Session session=factory.getCurrentSession();

		System.out.println("In Check login");
		System.out.println(username);
		System.out.println(password);
		
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

		//session.close();
		return userFound;    	
	}

}
