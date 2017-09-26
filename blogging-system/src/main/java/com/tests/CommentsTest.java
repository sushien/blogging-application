package com.tests;

import java.util.ArrayList;
import java.util.List;

import com.dao.CommentsDAO;
import com.dao.Impl.CommentsImple;
import com.model.Blog;
import com.model.Comments;
import com.model.User;

public class CommentsTest 
{
	public static void main(String[] args) 
	{
		Comments com = new Comments();
		
		com.setComments("HI");
		
		User ser= new User();
		ser.setUsername("rasiakd");
		com.setUser(ser);
		
		Blog blog = new Blog();
		blog.setBlogId(2);
		com.setBlog(blog);
		CommentsImple c = new CommentsImple();
		
		System.out.println("object inserted");
		List<Comments> result=new ArrayList<Comments>();
		result=c.getComment(1);
		 for (Object o : result) 
	        {
	            System.out.print(o + " ");
	        }
	        System.out.println();
	}
}