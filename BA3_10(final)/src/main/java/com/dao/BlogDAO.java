package com.dao;

import java.util.ArrayList;

import com.model.*;

//Blog Interface
public interface BlogDAO 
{
	public void createBlog(Blog blog);
	public void deleteBlog(int blogID);
	public void updateBlog(int blogId,Blog blog);
	public ArrayList<Blog> searchBlogByAuthor(String bgAuthor);
	public ArrayList<Blog> searchBlogByCategory(String bgCategory) ;
	public ArrayList<Blog> searchBlogByKeywordFromTitle(String bgKeyword);	
	public ArrayList<Blog> viewBlog();
	public ArrayList<Blog> viewBlog1();
	public ArrayList<Blog> openBlog(int blogId);
	//public ArrayList<Blog> openBloga(int blogId);
	public ArrayList<Blog> openBlogad(int blogId);
	public int averageRating( int blogId);
	public void approveblogs(int blogId);
	public void rejectblogs(int blogId);
	public ArrayList<Blog> viewBlog2(String username);
}
