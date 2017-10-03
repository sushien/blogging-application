package com.dao.Impl;

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

import com.dao.BlogDAO;
import com.model.Blog;

//Implementation of BlogDAO
@Repository("blogDao")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class BlogImple implements BlogDAO 
{

	@Autowired
	private SessionFactory factory;
	private int bId;

	//Creation of Blog
	public void createBlog(Blog blog) 
	{
		Session session=factory.getCurrentSession();
		session.save(blog);

	}

	//Deletion of Blog
	public void deleteBlog(int blogID) 
	{
		try
		{
			Session session=factory.getCurrentSession();
			Query query=session.createQuery("from Blog b where  b.blogId="+blogID);
			Iterator<Blog> itr=query.iterate();
			while(itr.hasNext())
			{	
				session.delete(itr.next());
			}			
		}catch(HibernateException e)
		{
			e.printStackTrace();
		}
	}


	//Updation of blog
	public void updateBlog(int bId,Blog blog)
	{			
		try
		{
			Session session=factory.getCurrentSession();
			Query query=session.createQuery("update Blog set blogTitle=\'"+blog.getBlogTitle()+"\',category='"+blog.getCategory()+"',description='"+blog.getDescription()+"',summary='"+blog.getSummary()+"',status='Pending' where blogId="+bId);
			query.executeUpdate();   
		}catch(HibernateException e)
		{       
			e.printStackTrace();
		}

	}

	//List of Blog for user
	public ArrayList<Blog> viewBlog() 
	{
		ArrayList<String> tableHeaders = new ArrayList<String>();
		Session session=factory.getCurrentSession();
		ArrayList <Blog> tableData = new ArrayList();
		Query query = session.createQuery("from Blog b where b.status='Approved'");
		List <Blog>list = query.list();

		for(Blog obj : list)
		{    
			tableData.add(obj);
		}
		for (Object o : tableData) 
		{
			System.out.print(o + " ");
		}
		System.out.println();
		return tableData;

	}

	//List of Blogs for Admin
	public ArrayList<Blog> viewBlog1() 
	{
		ArrayList<String> tableHeaders = new ArrayList<String>();
		Session session=factory.getCurrentSession();
		ArrayList <Blog> tableData = new ArrayList();
		Query query = session.createQuery("from Blog b where b.status='Pending'");
		List <Blog>list = query.list();

		for(Blog obj : list)
		{    
			tableData.add(obj);
		}
		for (Object o : tableData) 
		{
			System.out.print(o + " ");
		}
		System.out.println();
		return tableData;

	}


	//Search by title
	public ArrayList<Blog> searchBlogByKeywordFromTitle(String bgKeyword) 
	{
		System.out.println("in imple"+bgKeyword);
		Session session=factory.getCurrentSession();			
		Query query=session.createQuery("from Blog b where b.status='Approved' AND b.blogTitle like '%"+ bgKeyword +"%'");
		List <Blog>list = query.list();
		ArrayList <Blog>tableData = new ArrayList();
		for(Blog obj : list)
		{
			tableData.add(obj);
		}
		for (Object o : tableData) 
		{
			System.out.print(o + " ");
		}
		return tableData;

	}

	//Search by category
	public ArrayList<Blog> searchBlogByCategory(String bgCategory) 
	{
		Session session=factory.getCurrentSession();

		Query query=session.createQuery("from Blog b where b.status='Approved' AND b.category like '%"+ bgCategory +"%'");
		List <Blog> list = query.list();
		ArrayList <Blog> tableData1 = new ArrayList();
		for(Blog obj : list)
		{
			tableData1.add(obj);
		}
		for (Object o : tableData1) 
		{
			System.out.print(o + " ");
		}

		return tableData1;

	}

	//Search by author
	@Override
	public ArrayList<Blog> searchBlogByAuthor(String bgAuthor) 
	{
		Session session=factory.getCurrentSession();

		Query query=session.createQuery("from Blog b where b.status='Approved' AND b.author like '%"+bgAuthor+"%'");
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

		return tableData2;

	}

	//Calculating average ratings
	public int averageRating( int blogId) {

		try{ 
			Session session=factory.getCurrentSession();
			Query query=session.createQuery("select averageRating from Blog b where b.status='Approved' AND b.blogID="+blogId);

			@SuppressWarnings("rawtypes")
			List list = query.list();

			//call function to display
			display(list);

		}catch(HibernateException e){
			e.printStackTrace();
		}
		return blogId;
	}


	private void display(List list) {
		System.out.println(list);
	}


	//open Blog for user
	@Override
	public ArrayList<Blog> openBlog(int blogId) {
		Session session=factory.getCurrentSession();

		Query query=session.createQuery("from Blog b where b.status='Approved' AND b.blogId="+blogId);
		List<Blog> list = query.list();
		return new ArrayList<Blog>(list);
	}

	//open Blog for admin
	public ArrayList<Blog> openBlogad(int blogId) {
		Session session=factory.getCurrentSession();

		Query query=session.createQuery("from Blog b where b.status='Pending' AND b.blogId="+blogId);
		List<Blog> list = query.list();
		return new ArrayList<Blog>(list);
	}

	/*	public ArrayList<Blog> openBloga(int blogId) {
		Session session=factory.getCurrentSession();

		Query query=session.createQuery("from Blog b where b.status='Pending' AND b.blogId="+blogId);
		List list = query.list();
		ArrayList tableData1 = new ArrayList();
		for(Object obj : list)
		{
			Blog blog = (Blog) obj;
			ArrayList<Object> row = new ArrayList<Object>();
			StringBuilder sb=new StringBuilder();
			sb.append("");
			sb.append(blogId);
			String str=sb.toString();
			System.out.println(str);
			row.add(str);
			row.add(blog.getBlogTitle());
			row.add(blog.getCategory());
			row.add(blog.getDescription());
			tableData1.add(row);
		}
		for (Object o : tableData1) 
		{
			System.out.print(o + " ");
		}

		return tableData1;
	}
	 */
	//Listing blogs to user
	public void approveblogs(int blogId)
	{
		try
		{
			Session session=factory.getCurrentSession();
			Query query=session.createQuery("update Blog set status='Approved' where blogId="+blogId);
			query.executeUpdate();       
		}catch(HibernateException e)
		{       
			e.printStackTrace();
		}
	}

	//Listing current Blog
	@Override
	public ArrayList<Blog> viewBlog2(String username) {
		ArrayList<String> tableHeaders = new ArrayList<String>();
		Session session=factory.getCurrentSession();
		ArrayList <Blog> tableData = new ArrayList();
		Query query = session.createQuery("from Blog b where b.status='Approved' and b.user='"+username+"'");
		List <Blog>list = query.list();

		for(Blog obj : list)
		{    
			tableData.add(obj);
		}
		for (Object o : tableData) 
		{
			System.out.print(o + " ");
		}
		System.out.println();
		return tableData;

	}

	//Listing rejected blogs
	@Override
	public void rejectblogs(int blogId) {
		// TODO Auto-generated method stub
		try
		{
			Session session=factory.getCurrentSession();	
			Query query=session.createQuery("update Blog set status='Rejected' where blogId="+blogId);
			query.executeUpdate();    
		}catch(HibernateException e)
		{       
			e.printStackTrace();
		}

	}



}
