package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BlogDAO;
import com.dao.Impl.BlogImple;
import com.model.*;

//Implementation of Home Service
@Service("blogService")
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class HomeServiceImpl implements HomeService{

	//Autowire Blog bean
	@Autowired
	private BlogDAO blogDao=new BlogImple();

	//Search by title 
	public ArrayList<Blog> search_title(String title) {
		ArrayList<Blog> bloglist=new ArrayList<Blog>();
		System.out.println("in service"+title);
		bloglist=blogDao.searchBlogByKeywordFromTitle(title);
		return bloglist;
	}

	//search by category
	@Override
	public ArrayList<Blog> search_category(String category) {
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		System.out.println("in service"+category);
		bloglist1=blogDao.searchBlogByCategory(category);
		return bloglist1;
	}

	//search by author
	@Override
	public ArrayList<Blog> search_author(String author) {
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		System.out.println("in service"+author);
		bloglist1=blogDao.searchBlogByAuthor(author);
		return bloglist1;
	}

	//list blogs to user
	@Override
	public ArrayList<Blog> view_blog() {
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=blogDao.viewBlog();
		return bloglist1;
	}

    //open blog for user
	@Override
	public ArrayList<Blog> open_blog(int blogId) {
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		System.out.println("in service"+blogId);
		bloglist1=blogDao.openBlog(blogId);
		return bloglist1;

	}

}
