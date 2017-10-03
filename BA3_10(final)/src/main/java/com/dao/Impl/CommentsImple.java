package com.dao.Impl;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CommentsDAO;
import com.model.Comments;

//Implementation of CommentsDAO
@Repository("commentsDao")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class CommentsImple implements CommentsDAO
{

	@Autowired
	private SessionFactory mysession;
	private int bId;

	//Adding comment
	public void createcomment(Comments comment) 
	{
		System.out.println("in imple"+comment.getComments());
		Session session=mysession.getCurrentSession();
		session.save(comment);		
	}

	//Listing comments		
	public List<Comments> getcomment(int blogid) 
	{
		List<Comments> result;
		Session session=mysession.getCurrentSession();
		List tableData = new ArrayList();
		try
		{
			session.getSessionFactory();
			Query query=session.createQuery("FROM Comments where blogId="+blogid);
			List list = query.list();
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

    //deleting comment
	public void removecomment(int comid) 
	{
		Session session=mysession.getCurrentSession();
		Query query=session.createQuery("delete from Comments where commentId="+comid);
		query.executeUpdate();
	}

}
