package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Controller for Blogs of author
@Controller
public class BlogDetailsControllerAut {

	//Add comment to blog
	@RequestMapping("/add_comment")
	public ModelAndView detail1(){	
		return new ModelAndView("blogdetailsforauthor");
		
	}
	
	//Delete comment from blog
	@RequestMapping("/del_comment")
	public ModelAndView detail2(){
		return new ModelAndView("blogdetailsforauthor");
		
	}
	
	//Display comment of Blog
	@RequestMapping("/view_comment")
	public ModelAndView detail3(){
		return new ModelAndView("blogdetailsforauthor");
		
	}
	
	//Controller from Logout Button
	@RequestMapping("/logout3")
	public ModelAndView logout3(){
		return new ModelAndView("home");
		
	}

}
