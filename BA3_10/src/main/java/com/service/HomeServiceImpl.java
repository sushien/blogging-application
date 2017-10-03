package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BlogDAO;
import com.dao.UserDAO;
import com.dao.Impl.BlogImple;
import com.dao.Impl.UserImple;
import com.model.*;

@Service("blogService")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class HomeServiceImpl implements HomeService{

	 @Autowired
	 private BlogDAO blogDao=new BlogImple();
	 
	 
	public ArrayList<Blog> search_title(String title) {
		// TODO Auto-generated method stub
		ArrayList<Blog> bloglist=new ArrayList<Blog>();
		System.out.println("in service"+title);
		bloglist=blogDao.searchBlogByKeywordFromTitle(title);
		return bloglist;
	}


	
	public ArrayList<Blog> search_category(String category) {
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		System.out.println("in service"+category);
		bloglist1=blogDao.searchBlogByCategory(category);
		return bloglist1;
	}


	
	public ArrayList<Blog> search_author(String author) {
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		System.out.println("in service"+author);
		bloglist1=blogDao.searchBlogByAuthor(author);
		return bloglist1;
	}


	
	public ArrayList<Blog> view_blog() {
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		
		bloglist1=blogDao.viewBlog();
		return bloglist1;
	}



	public ArrayList<Blog> open_blog(int blogId) {
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		System.out.println("in service"+blogId);
		bloglist1=blogDao.openBlog(blogId);
		return bloglist1;
		
	}

}
