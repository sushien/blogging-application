package com.tests;
import com.dao.RatingDAO;

public class RatingTest 
{
	public static void main(String[] args) 
	{
				Rating rating = new Rating();
				
				rating.setRating(2);
				User ser= new User();
				ser.setUsername("rasiakd");
				rating.setUser(ser);
				Blog blog = new Blog();
				blog.setBlogId(2);
				rating.setBlog(blog);
				
				RatingImple dd= new RatingImple();
				dd.addRating(rating);
				

	}
}
	
	

