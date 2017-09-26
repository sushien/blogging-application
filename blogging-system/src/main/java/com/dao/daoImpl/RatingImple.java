package com.dao.Impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import com.utility.MyUtil;
import com.model.Rating;

public class RatingImple 
{
	private Session session;
	private int bId;
	
	public void addRating(Rating rate) 
	{
		this.session=MyUtil.getSess();
		session.beginTransaction();
		session.save(rate);
		session.getTransaction().commit();
		
	}

}
