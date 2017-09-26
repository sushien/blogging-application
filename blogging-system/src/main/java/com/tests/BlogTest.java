package com.tests;

import java.util.Date;
import com.dao.Impl.BlogImple;
import com.model.Blog;

public class BlogTest 
{
	public static void main(String[] args) 
	{
		Blog blog1=new Blog();
		BlogImple bi=new BlogImple();
		
		bi.createBlog(blog1);
		
		bi.deleteBlog(2);
				
		blog1.setBlogTitle("Science");		
		blog1.setCategory("Art");
		blog1.setDescription("some Mathematics ");
		blog1.setSummary("some mathematics tricks are as follows:"
				+ "1.Pythagorous therom :a^2+b^2=c^2"
				+ "2. total of  the angles in the triangle=180");
		
		bi.updateBlog(3, blog1);
		
		bi.searchBlogByCategory("Education");
		bi.searchBlogByKeywordFromTitle("dreamcatcher");
		bi.searchBlogByAuthor("Ketaki Gujar");
			
		bi.viewBlog();
		bi.averageRating(2);
	}

}