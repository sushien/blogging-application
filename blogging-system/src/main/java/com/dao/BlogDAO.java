package com.BloggingApplication.DAO;

import java.util.List;

import com.BloggingApplication.model.Blog;

public interface BlogDAO {

	public void createBlog(Blog blog);
	
	public void deleteBlog(int blogID);
	
	
	
}
