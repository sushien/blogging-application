package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Blog;

@Controller
public class BlogDetailsControllerUser {
	
	/*@RequestMapping("/add_comment")
	public ModelAndView detail1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("addcomments","mdu1",blog.toString());
		
	}
	@RequestMapping("/del_comment")
	public ModelAndView detail2(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("deletecomments","mdu2",blog.toString());
		
	}
	
	@RequestMapping("/view_comment")
	public ModelAndView detail3(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("viewcomments","mdu3",blog.toString());
		
	}*/
	
	
	
	@RequestMapping("/add_rating")
	public ModelAndView detail4(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("viewcomments","mdu4",blog.toString());
		
	}

}
