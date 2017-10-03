package com.dao.Impl;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CommentsDAO;
//import com.utility.MyUtil;
import com.model.Blog;
import com.model.Comments;

@Repository("commentsDao")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class CommentsImple implements CommentsDAO
{
	@Autowired
	private SessionFactory factory;
	private int bId;
	
	public void createcomment(Comments comment) 
	{
		System.out.println("in imple"+comment.getComments());
		Session session=factory.getCurrentSession();
		//session.getSessionFactory();
		//session.beginTransaction();
		session.save(comment);
		//session.getTransaction().commit();
		//session.close();
		
				
	}
			
			
	public List<Comments> getComment(int blogid) 
	{
		List<Comments> result;
		Session session=factory.getCurrentSession();
		List tableData = new ArrayList();
		try
		{
			session.getSessionFactory();
			
			
	       			
			Query query=session.createQuery("FROM Comments where blogId="+blogid);
			  List list = query.list();
			//result=query.list();
			for(Object obj : list)
	        {    
	            Comments comment = (Comments) obj;
	            ArrayList<Object> row = new ArrayList<Object>();     
	            row.add(comment.getComments());
	            
	            tableData.add(row);
	        }
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
		return tableData;
		
	}
		

	public void removecomment(int comid) 
	{
		Session session=factory.getCurrentSession();
		Query query=session.createQuery("delete from Comments where commentId="+comid);
		query.executeUpdate();
		
			
	}


	
	public void createComment(Comments comment) {
		// TODO Auto-generated method stub
		
	}


	public void removeComment(int comid) {
		// TODO Auto-generated method stub
		
	}

}
