package com.service;

import java.util.ArrayList;

import com.model.User;
import com.model.Blog;
public interface HomeService {

	public ArrayList<Blog> search_title(String title);
	public ArrayList<Blog> view_blog();
	public ArrayList<Blog> open_blog(int blogId);
	public ArrayList<Blog> search_category(String category);
	public ArrayList<Blog> search_author(String author);
}
