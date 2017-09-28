package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Blog;

@Controller
public class HomeController {
	
	@RequestMapping("/login_blog")
	public ModelAndView login1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("login","mdt1",blog.toString());
		
	}
	@RequestMapping("/logout")
	public ModelAndView logout(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("home","mdt0",blog.toString());
		
	}
	
	@RequestMapping("/register_blog")
	public ModelAndView register1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("register","mdt2",blog.toString());
		
	}
	
	
	@RequestMapping("/search_title")
	public ModelAndView searcht(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("home","mdt3",blog.toString());
		
	}
	
	@RequestMapping("/search_title1")
	public ModelAndView searcht1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","mdt30",blog.toString());
		
	}
	@RequestMapping("/search_category")
	public ModelAndView searchc(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("home","mdt4",blog.toString());
		
	}
	
	@RequestMapping("/search_category1")
	public ModelAndView searchc1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","mdt40",blog.toString());
		
	}
	
	@RequestMapping("/search_author")
	public ModelAndView searcha(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("home","mdt5",blog.toString());
		
	}
	
	
	@RequestMapping("/search_author1")
	public ModelAndView searcha1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","mdt50",blog.toString());
		
	}
	
	@RequestMapping("/view_blog")
	public ModelAndView viewb(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("home","mdt6",blog.toString());
		
	}
	
	@RequestMapping("/view_blog1")
	public ModelAndView viewb1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","mdt60",blog.toString());
		
	}
	@RequestMapping("/open_blogu1")
	public ModelAndView openu(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("blogdetailsforuser","mdt7",blog.toString());
		
	}
	
	@RequestMapping("/open_blogu")
	public ModelAndView openu1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("simpleblog","mdt70",blog.toString());
		
	}
	
	@RequestMapping("/your_blog")
	public ModelAndView yourblog(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("blog","mdt8",blog.toString());
		
	}

}
