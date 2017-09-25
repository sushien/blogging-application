package com.BloggingApplication.DAO;

import java.util.Date;

import com.BloggingApplication.model.Blog;
//import com.BloggingApplication.model.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Blog blog1=new Blog();
		blog1.setBlogTitle("Science");
		
		blog1.setCategory("Art");
		blog1.setDescription("some Mathematics ");
		blog1.setSummary("some mathematics tricks are as follows:"
				+ "1.Pythagorous therom :a^2+b^2=c^2"
				+ "2. total of  the angles in the triangle=180");
		
		BlogImple bi=new BlogImple();
		bi.createBlog(blog1);
		System.out.println("blog inserted");
		
		bi.deleteBlog(2);
		
		System.out.println("blog deleted");
		
		
		
		
	}
	
	
	

}
