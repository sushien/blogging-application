package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Blog;

@Controller
public class AdminController {
	
	@RequestMapping("/login_admin")
	public ModelAndView yourblog(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("admin","mdt8",blog.toString());
		
	}
	
	@RequestMapping("/approved")
	public ModelAndView approve(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("approve","mdt9",blog.toString());
		
	}
	@RequestMapping("/rejected")
	public ModelAndView reject(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("reject","mdt10",blog.toString());
		
	}
	@RequestMapping("/admin1")
	public ModelAndView admin(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("admin","mdt11",blog.toString());
		
	}
	@RequestMapping("/send1")
	public ModelAndView send1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("approve","mdt12",blog.toString());
		
	}

}
