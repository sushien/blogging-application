package com.BloggingApplication.DAO;

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

	
	


}
