package com.dao.Impl;

import org.hibernate.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import com.utility.MyUtil;
import com.model.Comments;

public class CommentsImple 
{
	private Session session;
	private int bId;
	
	public void createcomment(Comments comment) 
	{
		this.session=MyUtil.getSess();		
		session.getSessionFactory();
		session.beginTransaction();
		session.save(comment);
		session.getTransaction().commit();
		//session.close();
				
	}
			
			
	public List<Comments> getComment(int blogid) 
	{
		List<Comments> result;
		this.session=MyUtil.getSess();	
		List tableData = new ArrayList();
		try
		{
			session.getSessionFactory();
			session.beginTransaction();	
			
			
	       			
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
			session.getTransaction().commit();
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
		return tableData;
		
	}
		

	public void removecomment(int comid) 
	{
		session=MyUtil.getSess();	
		session.beginTransaction();
		Query query=session.createQuery("delete from Comments where commentId="+comid);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
			
	}

}
