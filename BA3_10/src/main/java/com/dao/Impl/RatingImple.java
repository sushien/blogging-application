package com.dao.Impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

//import com.utility.MyUtil;
import com.model.Rating;

public class RatingImple 
{
	@Autowired
	private SessionFactory factory;
	private int bId;
	
	public void addRating(Rating rate) 
	{
		Session session=factory.getCurrentSession();
		//session.beginTransaction();
		session.save(rate);
		//session.getTransaction().commit();
		
	}

}
