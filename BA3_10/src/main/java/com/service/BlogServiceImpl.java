package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BlogDAO;
import com.dao.UserDAO;
import com.dao.Impl.BlogImple;
import com.model.Blog;


@Service("blogService1")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class BlogServiceImpl implements BlogService{

	@Autowired
    private BlogDAO blogDao=new BlogImple();
	
	
	static ArrayList <Blog>bd=new ArrayList<Blog>();
	
	

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)

	public void create_blog(Blog blog) {
		// TODO Auto-generated method stub
	
		     blogDao.createBlog(blog);
		    
	}


	
	public void approved(Blog blog) {
		// TODO Auto-generated method stub
		bd.remove(blog);
		blogDao.createBlog(blog);
	}


	public ArrayList<Blog> view_blog() {
		
		ArrayList <Blog> tableData = new ArrayList<Blog>();
        /*for(Blog obj : bd)
        {    
            tableData.add(obj);
        }
        for (Blog o : tableData) 
        {
            System.out.print(o + " ");
        }
        System.out.println();*/
		
		tableData=blogDao.viewBlog1();
        return tableData;
	}

	/*public ArrayList<Blog> view_blog2()
	{
		ArrayList <Blog> tableData = new ArrayList<Blog>();	
		tableData=blogDao.viewBlog2();
        return tableData;
	}*/

/*	@Override
	public ArrayList<Blog> open_bloga(String title) {
		// TODO Auto-generated method stub
		System.out.println(title);
		ArrayList <Blog> tableData1 = new ArrayList<Blog>();
		int i=0;
        for(Blog obj : bd)
        { 
        	System.out.println(obj.getBlogTitle());
        	if(obj.getBlogTitle().equals(title));
        	{
        		System.out.println(obj.getBlogTitle());
        		System.out.println(obj);
        		break;
        		//tableData1.add(obj);
        	}
        }
        for (Blog o : tableData1) 
        {
            System.out.print(o + " ");
        }
        System.out.println();
        return tableData1;
	}
*/

	public ArrayList<Blog> open_bloga(int blogId) {
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		System.out.println("in service"+blogId);
		bloglist1=blogDao.openBloga(blogId);
		return bloglist1;
		
	}
	
	public ArrayList<Blog> open_blogad(int blogId) {
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		System.out.println("in service"+blogId);
		bloglist1=blogDao.openBlogad(blogId);
		return bloglist1;
		
	}


	
	public void approveddb(int blogId) {
		// TODO Auto-generated method stub
		blogDao.approveblogs(blogId);
	}


	
	public ArrayList<Blog> view_blog2(String username) {
		// TODO Auto-generated method stub
		ArrayList <Blog> tableData = new ArrayList<Blog>();
		tableData=blogDao.viewBlog2(username);
		return tableData;
	}



	public void updateBlog(int blogId, Blog blog) {
		// TODO Auto-generated method stub
		blogDao.updateBlog(blogId, blog);
		
	}


	
	public void delete_blog(int blogId) {
		// TODO Auto-generated method stub
		blogDao.deleteBlog(blogId);
	}



	public void rejecteddb(int blogId) {
		// TODO Auto-generated method stub
		blogDao.rejectblogs(blogId);
	}



}
