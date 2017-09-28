package com.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Impl.BlogImple;
import com.model.Blog;

@Controller
public class BlogController {
	
	@RequestMapping("/create_blog")
	public ModelAndView creation(BlogImple blogimple){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");
		//blog.setBlogId(2);
		blog.setAuthor("abc");
		blog.setAverageRating(3);
		//blog.setBlogMedia(blogMedia);
		blog.setCategory("phones");
		/*Timestamp d=new Date();
		blog.setCreatedDate(d);
		blog.setModifiedDate(modifiedDate);*/
		blog.setSummary("hjewhek gwkrjhkej");
		//blogimple.createBlog(blog);
		modo.put("first", blog.toString());
		return new ModelAndView("createblog","mds",blog.toString());
	}
	
	@RequestMapping("/update_blog")
	public ModelAndView updation(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("updateblog","mds1",blog.toString());
		
	}
	@RequestMapping("/delete_blog")
	public ModelAndView deletion(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("blog","mds2",blog.toString());
		
	}
	@RequestMapping("/approve_req")
	public ModelAndView send(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("blog","mds2",blog.toString());
		
	}
	

	@RequestMapping("/search_title2")
	public ModelAndView searcht1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("blog","mdt30",blog.toString());
		
	}
	@RequestMapping("/open_bloga")
	public ModelAndView openblog(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("blogdetailsforauthor","mds3",blog.toString());
		
	}
	
	@RequestMapping("/home1")
	public ModelAndView openblog1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","mds3",blog.toString());
		
	}
	@RequestMapping("/home2")
	public ModelAndView openblog2(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","mds3",blog.toString());
		
	}
	@RequestMapping("/logout1")
	public ModelAndView logout(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("home","mdt0",blog.toString());
		
	}
	@RequestMapping("/logout2")
	public ModelAndView logout2(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("home","mdt0",blog.toString());
		
	}
	
	
	
}
