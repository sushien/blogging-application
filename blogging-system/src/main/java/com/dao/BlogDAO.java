package com.dao;

import java.util.List;
import com.model.Blog;

public interface BlogDAO 
{
	public void createBlog(Blog blog);	
	public void deleteBlog(int blogID);
	public void updateBlog(int blogId,Blog blog);	
	public Blog searchBlogByAuthor(String bgAuthor);
	public Blog searchBlogByCategory(String bgCategory) ;
	public Blog searchBlogByKeywordFromTitle(String bgKeyword);	
	public void viewBlog();
	public int averageRating( int blogId);

}
