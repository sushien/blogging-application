package com.controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Impl.BlogImple;
import com.model.Blog;
import com.model.User;
import com.service.BlogService;
import com.service.HomeService;

//Blog Controller
@Controller
public class BlogController {


	@Autowired 
	private BlogService blogService1;

	@Autowired 
	private HomeService homeService;

	@Autowired
	private HttpSession mysession;

	//Controller for creating Blogs
	@RequestMapping("/create_blog")
	public ModelAndView creation(BlogImple blogimple){
		return new ModelAndView("createblog");
	}

	//Controller for updating Blogs
	@RequestMapping(value="/update_blog",method=RequestMethod.GET)
	public ModelAndView updation(HttpServletRequest request,HttpServletResponse res){
		mysession=request.getSession();
		System.out.println(mysession);
		int id=Integer.parseInt(request.getParameter("id"));
		System.out.println("print"+id);
		ArrayList<Blog> bloglist1=homeService.open_blog(id);
		return new ModelAndView("updateblog","list7",bloglist1);

	}
	
	//Controller for deleting Blogs
	@RequestMapping(value="/delete_blog",method=RequestMethod.GET)
	public ModelAndView deletion(HttpServletRequest request,HttpServletResponse res){
		mysession=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		blogService1.delete_blog(id);
		return new ModelAndView("blog");

	}
	
	
	//Send for Approval after creation
	@RequestMapping(value="/approve_req")
	public ModelAndView send(@RequestParam String blogtitle,@RequestParam String summary,@RequestParam String description,@RequestParam String category,@RequestParam String author){
		Blog b=new Blog();
		User u=new User();
		u.setUsername(mysession.getAttribute("username").toString());
		b.setBlogTitle(blogtitle);
		b.setSummary(summary);
		b.setDescription(description);
		b.setStatus("Pending");
		b.setAuthor(author);
		b.setCategory(category);
		b.setUser(u);
		blogService1.create_blog(b);
		return new ModelAndView("blog");

	}

	//Send for Approval after updation
	@RequestMapping(value="/approve_req1",method=RequestMethod.GET)
	public ModelAndView sendapp(HttpServletRequest request,HttpServletResponse res){
		mysession=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		String blogtitle=request.getParameter("blogtitle");
		String summary=request.getParameter("summary");
		String description=request.getParameter("description");
		String author=request.getParameter("author");
		String category=request.getParameter("category");
		System.out.println(blogtitle);
		System.out.println(summary);
		System.out.println(description);
		Blog b=new Blog();
		b.setBlogTitle(blogtitle);
		b.setSummary(summary);
		b.setDescription(description);
		b.setAuthor(author);
		b.setCategory(category);
		blogService1.updateBlog(id,b);
		return new ModelAndView("blog");

	}


	//open blog for from author page
	@RequestMapping(value="/open_blogaut",method=RequestMethod.GET)
	public ModelAndView openblog(HttpServletRequest request,HttpServletResponse res){
		mysession=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.open_blog(id);
		return new ModelAndView("blogdetailsforauthor","list5",bloglist1);

	}

	//Controller for displaying blogs
	@RequestMapping("/my_blogs")
	public ModelAndView searcht12(HttpServletRequest request,HttpServletResponse res)
	{
		mysession=request.getSession();
		String username=mysession.getAttribute("username").toString();
		System.out.println(username);	
		ModelAndView mav=new ModelAndView();
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=blogService1.view_blog2(username);		
		mav= new ModelAndView("blog","list3",bloglist1);
		return mav;

	}


}
