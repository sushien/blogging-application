package com.dao.Impl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import com.dao.UserDAO;
import com.model.*;
import com.utility.MyUtil;

public class UserImple implements UserDAO 
{
	private Session session;
	@Override
	public void createUser(User user) 
	{
		// TODO Auto-generated method stub
		this.session=MyUtil.getSess();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
	}

	@Override
	public boolean findUser(String username,String password) 
	{	 
		  System.out.println("In Check login");
		    this.session=MyUtil.getSess();
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

			session.close();
			return userFound;    	
	}

}
