package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Blog;
import com.service.BlogService;

//Admin Controller
@Controller
public class AdminController {
	
	
	@Autowired 
	private BlogService blogService;
	
	@Autowired
	private HttpSession mysession;
	
	//Controller for approved Blogs
	@RequestMapping(value="/approved",method=RequestMethod.GET)
	public ModelAndView approve(HttpServletRequest request,HttpServletResponse res){
	    int id=Integer.parseInt(request.getParameter("id"));
		blogService.approveddb(id);
		return new ModelAndView("approve");
		
	}
	
	//Controller for listing Blogs
	@RequestMapping(value="/view_approve")
	public ModelAndView viewapprove(){
		ArrayList<Blog> arr =new ArrayList<Blog>();
		arr=blogService.view_blog();
		return new ModelAndView("approve","arr1",arr);
		
	}
	
	//Controller for Rejected Blogs
	@RequestMapping(value="/rejected",method=RequestMethod.GET)
	public ModelAndView reject(HttpServletRequest request,HttpServletResponse res){
		 int id=Integer.parseInt(request.getParameter("id"));
			blogService.rejecteddb(id);
		return new ModelAndView("approve");
		
	}
	
	//Controller for Opening a blog
	@RequestMapping(value="/open_bloga1",method=RequestMethod.GET)
	public ModelAndView openu(HttpServletRequest request,HttpServletResponse res){
		    int id=Integer.parseInt(request.getParameter("id"));
		    ArrayList<Blog> bloglist1=new ArrayList<Blog>();
			bloglist1=blogService.open_blogad(id);
			return new ModelAndView("admin","list4",bloglist1);		
	}
	
	

}
