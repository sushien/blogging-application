package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Blog;

@Controller
public class UserController {
	
	@RequestMapping("/sign_in")
	public ModelAndView login1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","md",blog.toString());
		
	}
	@RequestMapping("/home")
	public ModelAndView home1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("home","md2",blog.toString());
		
	}
	
	@RequestMapping("/sign_up")
	public ModelAndView register1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("register","md1",blog.toString());
		
	}
	@RequestMapping("/go_to_login")
	public ModelAndView gotolog(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("login","md1",blog.toString());
		
	}
	
	@RequestMapping("/go_to_home1")
	public ModelAndView gotohom(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","md1",blog.toString());
		
	}

}
