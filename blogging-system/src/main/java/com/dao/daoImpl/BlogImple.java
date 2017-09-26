package com.dao.Impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import com.utility.*;
import com.dao.BlogDAO;
import com.model.Blog;

public class BlogImple implements BlogDAO 
{
	private Session session;
	private int bId;
	
	@Override
	public void createBlog(Blog blog) 
	{
		this.session=MyUtil.getSess();
		session.beginTransaction();
		session.save(blog);
		session.getTransaction().commit();
			
	}
	
	
	@Override
	public void deleteBlog(int blogID) 
	{
		try
		{
			this.session=MyUtil.getSess();
			session.beginTransaction();
			Query query=session.createQuery("from Blog where blogID="+blogID);
			Iterator<Blog> itr=query.iterate();
			while(itr.hasNext())
			{	
				session.delete(itr.next());
			}			
			session.getTransaction().commit();
            session.close();            
        }catch(HibernateException e)
		{
            e.printStackTrace();
        }
	}
	
	
	@Override
	public void updateBlog(int bId,Blog blog)
	{			
		try
		{
			this.session=MyUtil.getSess();
			session.beginTransaction();	
			Query query=session.createQuery("update Blog set blogTitle=\'"+blog.getBlogTitle()+"\',category='"+blog.getCategory()+"',description='"+blog.getDescription()+"',summary='"+blog.getSummary()+"' where blogId="+bId);
			query.executeUpdate();
			session.getTransaction().commit();       
	    }catch(HibernateException e)
		{       
	        e.printStackTrace();
	    }
		
	}


	@Override
	public void viewBlog() 
	{
		ArrayList<String> tableHeaders = new ArrayList<String>();
		this.session=MyUtil.getSess();
		ArrayList tableData = new ArrayList();
        Query query = session.createQuery("from Blog");
        List list = query.list();
        tableHeaders.add("id");
        tableHeaders.add("Title");
        tableHeaders.add("Category");
        tableHeaders.add("Description");
        for(Object obj : list)
        {    
            Blog blog = (Blog) obj;
            ArrayList<Object> row = new ArrayList<Object>();     
            row.add(blog.getBlogId());
            row.add(blog.getBlogTitle());
            row.add(blog.getCategory());
            row.add(blog.getDescription());
            tableData.add(row);
        }
        for (Object o : tableData) 
        {
            System.out.print(o + " ");
        }
        System.out.println();
		
	}
	
	
	@Override
	public Blog searchBlogByKeywordFromTitle(String bgKeyword) 
	{
		this.session=MyUtil.getSess();
		session.beginTransaction();			
		Query query=session.createQuery("from Blog b where b.blogTitle like '%"+ bgKeyword +"%'");
		List list = query.list();
		ArrayList tableData = new ArrayList();
		for(Object obj : list)
		{
			Blog blog = (Blog) obj;
		    ArrayList<Object> row = new ArrayList<Object>();
		    row.add(blog.getBlogId());
		    row.add(blog.getBlogTitle());
		    row.add(blog.getCategory());
		    row.add(blog.getDescription());
		    tableData.add(row);
		}
		for (Object o : tableData) 
		{
			System.out.print(o + " ");
		}
		session.getTransaction().commit();
	    session.close();
		return null;
	
	}
		
	
	@Override
	public Blog searchBlogByCategory(String bgCategory) 
	{
		this.session=MyUtil.getSess();
		session.beginTransaction();	
		Query query=session.createQuery("from Blog b where b.category like '%"+ bgCategory +"%'");
		List list = query.list();
		ArrayList tableData1 = new ArrayList();
		for(Object obj : list)
		{
			Blog blog = (Blog) obj;
		    ArrayList<Object> row = new ArrayList<Object>();
		    row.add(blog.getBlogId());
		    row.add(blog.getBlogTitle());
		    row.add(blog.getCategory());
		    row.add(blog.getDescription());
		    tableData1.add(row);
		}
		for (Object o : tableData1) 
		{
			System.out.print(o + " ");
		}
		session.getTransaction().commit();
	    session.close();
		return null;
	
	}

		
	@Override
	public Blog searchBlogByAuthor(String bgAuthor) 
	{
		this.session=MyUtil.getSess();
		session.beginTransaction();	
		Query query=session.createQuery("from Blog b where b.author like '%"+bgAuthor+"%'");
		List list = query.list();
		ArrayList tableData2 = new ArrayList();
		for(Object obj : list)
		{
			Blog blog = (Blog) obj;
			ArrayList<Object> row = new ArrayList<Object>();
			row.add(blog.getBlogId());
			row.add(blog.getBlogTitle());
			row.add(blog.getCategory());
			row.add(blog.getDescription());
			tableData2.add(row);
		}
		for (Object o : tableData2) 
		{
			System.out.print(o + " ");
		}
		session.getTransaction().commit();
		session.close();
		return null;
		
	}


	public int averageRating( int blogId) 
	{	
	    try
	    { 
            	this.session=MyUtil.getSess();
    		session.beginTransaction();
    	
    		/*Query query=session.createQuery("select blogId,avg(rating) from rating b where blogID="+blogId);
    		List list = query.list();*/
    		
    		Query query=session.createQuery("select averageRating from Blog b where blogID="+blogId);
    		
            	@SuppressWarnings("rawtypes")
		List list = query.list();
        
                display(list);
          
            session.getTransaction().commit();
            
        }catch(HibernateException e){
            e.printStackTrace();
        }
		return blogId;
    }

	private void display(List list) {
	// TODO Auto-generated method stub
	System.out.println(list);
}


}

	

