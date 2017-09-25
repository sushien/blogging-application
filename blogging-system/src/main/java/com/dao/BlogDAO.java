package com.BloggingApplication.DAO;

import java.util.List;

import com.BloggingApplication.model.Blog;

public interface BlogDAO {

	public void createBlog(Blog blog);
	
	public void deleteBlog(int blogID);
public void updateBlog(int blogId,Blog blog);
	
	public Blog searchBlogByAuthor(String author);
	
	
	
}
