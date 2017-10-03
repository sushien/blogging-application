package com.service;

import java.util.ArrayList;
import com.model.Blog;

//Blog Service Interface
public interface BlogService {
	
	public void create_blog(Blog blog);
	public void delete_blog(int blogId);
	public void updateBlog(int blogId,Blog blog);
	public ArrayList<Blog> view_blog();
	public ArrayList<Blog> open_blogad(int blogId);
    public void approveddb(int blogId);
    public void rejecteddb(int blogId);
    public ArrayList<Blog> view_blog2(String username);
   //public ArrayList<Blog> open_bloga(int blogId);
}
