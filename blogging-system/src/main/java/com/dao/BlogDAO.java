package com.dao;

import java.util.List;

import com.BloggingApplication.model.Blog;

public interface BlogDAO {

	public void createBlog(Blog blog);
	
	public void deleteBlog(int blogID);
public void updateBlog(int blogId,Blog blog);
	
	public Blog searchBlogByAuthor(String author);
	public Blog searchBlogByCategory(String category) ;
	public Blog searchBlogByTitle(String bgTitle);
	
	public void viewBlog();
	
}
