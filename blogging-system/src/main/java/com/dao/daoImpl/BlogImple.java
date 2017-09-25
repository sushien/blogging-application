package com.dao.daoImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.mapping.Table;

import com.BloggingApplication.Util.MyUtil;
import com.BloggingApplication.model.Blog;

public class BlogImple implements BlogDAO {

	private Session session;
	private int bId;
	@Override
	public void createBlog(Blog blog) {
		// TODO Auto-generated method stub
		this.session=MyUtil.getSess();
		session.beginTransaction();
		session.save(blog);
		session.getTransaction().commit();
		
		
	}

	

	@Override
	public void deleteBlog(int blogID) {
		try{
           
			
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
			
			
            
        }catch(HibernateException e){
           // JOptionPane.showMessageDialog(null, "Error occured !");
            e.printStackTrace();
        }
	}

	@Override
	public void updateBlog(int bId,Blog blog) {
			// TODO Auto-generated method stub
	try{
		
				/*blog.setBlogId(bId);*/
				this.session=MyUtil.getSess();
				session.beginTransaction();
				
				
				Query query=session.createQuery("update Blog set blogTitle=\'"+blog.getBlogTitle()+"\',category='"+blog.getCategory()+"',description='"+blog.getDescription()+"',summary='"+blog.getSummary()+"' where blogId="+bId);
				
				query.executeUpdate();
				session.getTransaction().commit();
	           
	  
				
				
				
				
	            
	        }catch(HibernateException e){
	           
	            e.printStackTrace();
	        }
		
	}

	

	

	@Override
	public Blog searchBlogByAuthor(String author) {
		this.session=MyUtil.getSess();
		session.beginTransaction();
		
		Query query=session.createQuery("from Blog b where b.author ='"+author+"'");
		List list = query.list();
		
		 
			Vector tableData2 = new Vector();
			
			for(Object obj : list){
	            
	            Blog blog = (Blog) obj;
	            Vector<Object> row = new Vector<Object>();
	            
	            row.add(blog.getBlogId());
	            row.add(blog.getBlogTitle());
	            row.add(blog.getCategory());
	            row.add(blog.getDescription());
	            
	            
	            tableData2.add(row);
	        }
	        for (Object o : tableData2) {
	            System.out.print(o + " ");
	        }
		
		
		session.getTransaction().commit();
        session.close();
		
		

		return null;
	}
@Override
	public Blog searchBlogByTitle(String bgTitle) {
		this.session=MyUtil.getSess();
		session.beginTransaction();
		
		Query query=session.createQuery("from Blog b where b.blogTitle ='"+bgTitle+"'");
		List list = query.list();
		//Iterator<Blog> itr=query.iterate();
		 
			ArrayList tableData = new ArrayList();
			
			for(Object obj : list){
	            
	            Blog blog = (Blog) obj;
	            ArrayList<Object> row = new ArrayList<Object>();
	            
	            row.add(blog.getBlogId());
	            row.add(blog.getBlogTitle());
	            row.add(blog.getCategory());
	            row.add(blog.getDescription());
	            
	            
	            tableData.add(row);
	        }
	        for (Object o : tableData) {
	            System.out.print(o + " ");
	        }
		
		
		session.getTransaction().commit();
        session.close();
		
		

		return null;
	}
	@Override
	public Blog searchBlogByCategory(String category) {
		this.session=MyUtil.getSess();
		session.beginTransaction();
		
		Query query=session.createQuery("from Blog b where b.category ='"+category+"'");
		List list = query.list();
		//Iterator<Blog> itr=query.iterate();
		 
			Vector tableData1 = new Vector();
			
			for(Object obj : list){
	            
	            Blog blog = (Blog) obj;
	            Vector<Object> row = new Vector<Object>();
	            
	            row.add(blog.getBlogId());
	            row.add(blog.getBlogTitle());
	            row.add(blog.getCategory());
	            row.add(blog.getDescription());
	            
	            
	            tableData1.add(row);
	        }
	        for (Object o : tableData1) {
	            System.out.print(o + " ");
	        }
		
		
		session.getTransaction().commit();
        session.close();
		
		

		return null;
	}

	


}
