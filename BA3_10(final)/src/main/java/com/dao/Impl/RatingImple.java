package com.dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.model.Rating;

//Implementation of Ratings
public class RatingImple 
{
	@Autowired
	private SessionFactory factory;
	private int bId;
	
	//add ratings from user
	public void addRating(Rating rate) 
	{
		Session session=factory.getCurrentSession();
		session.save(rate);
	}

}
