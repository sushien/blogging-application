package com.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BlogDAO;
import com.dao.Impl.BlogImple;
import com.model.Blog;

//Implementation of Blog Service
@Service("blogService1")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class BlogServiceImpl implements BlogService{

	//Autowire Blog bean
	@Autowired
	private BlogDAO blogDao=new BlogImple();

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)

	//creation of blog
	public void create_blog(Blog blog) {
			blogDao.createBlog(blog);
	}

	//List the blogs
	public ArrayList<Blog> view_blog() {
		ArrayList <Blog> tableData = new ArrayList<Blog>();
		tableData=blogDao.viewBlog1();
		return tableData;
	}


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

    //Open blog for admin
	public ArrayList<Blog> open_blogad(int blogId) {
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		System.out.println("in service"+blogId);
		bloglist1=blogDao.openBlogad(blogId);
		return bloglist1;

	}

    //list of blogs for user
	@Override
	public void approveddb(int blogId) {
		blogDao.approveblogs(blogId);
	}

    //Display Blogs
	@Override
	public ArrayList<Blog> view_blog2(String username) {
		ArrayList <Blog> tableData = new ArrayList<Blog>();
		tableData=blogDao.viewBlog2(username);
		return tableData;
	}

    //Updation of Blog
	@Override
	public void updateBlog(int blogId, Blog blog) {
		blogDao.updateBlog(blogId, blog);

	}

	//deletion of Blog
	@Override
	public void delete_blog(int blogId) {
		blogDao.deleteBlog(blogId);
	}

    //List of rejected blogs
	@Override
	public void rejecteddb(int blogId) {
		blogDao.rejectblogs(blogId);
	}



}
