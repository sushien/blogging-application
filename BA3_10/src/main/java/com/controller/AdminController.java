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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Blog;
import com.service.BlogService;
import com.service.HomeService;

@Controller
public class AdminController {
	
	
	@Autowired 
	private BlogService blogService;
	
	@Autowired
	private HttpSession factory;
	
	
	@RequestMapping(value="/approved",method=RequestMethod.GET)
	public ModelAndView approve(HttpServletRequest request,HttpServletResponse res){
		//factory=request.getSession();
	    int id=Integer.parseInt(request.getParameter("id"));
		blogService.approveddb(id);
		return new ModelAndView("approve");
		
	}
	
	
	@RequestMapping(value="/view_approve")
	public ModelAndView viewapprove(){
		ArrayList<Blog> arr =new ArrayList<Blog>();
		arr=blogService.view_blog();
		return new ModelAndView("approve","arr1",arr);
		
	}
	
	
	@RequestMapping(value="/rejected",method=RequestMethod.GET)
	public ModelAndView reject(HttpServletRequest request,HttpServletResponse res){
		 int id=Integer.parseInt(request.getParameter("id"));
			blogService.rejecteddb(id);
		return new ModelAndView("approve");
		
	}
	@RequestMapping("/admin1")
	public ModelAndView admin(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("admin","mdt11",blog.toString());
		
	}
	
	@RequestMapping(value="/open_bloga1",method=RequestMethod.GET)
	public ModelAndView openu(HttpServletRequest request,HttpServletResponse res){
		    //factory=request.getSession();
		    int id=Integer.parseInt(request.getParameter("id"));
		   // Blog b=new Blog();
		   // b.setBlogId(id);
		    ArrayList<Blog> bloglist1=new ArrayList<Blog>();
			bloglist1=blogService.open_blogad(id);
			return new ModelAndView("admin","list4",bloglist1);
		
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
