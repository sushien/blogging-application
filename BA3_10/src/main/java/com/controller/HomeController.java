package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;*/







import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.BlogDAO;
import com.dao.Impl.BlogImple;
import com.model.Blog;
import com.service.HomeService;
import com.service.UserService;

@Controller
public class HomeController {
	
	
	@Autowired 
	private HomeService homeService;
	
	@Autowired
	private HttpSession factory;
	
	@RequestMapping("/login_blog")
	public ModelAndView login1(){
		
		return new ModelAndView("login");
		
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
	
	
	@RequestMapping(value = "/send_title")
	public ModelAndView searcht(@RequestParam String title){
		System.out.println(title);
		ArrayList<Blog> bloglist=new ArrayList<Blog>();
		bloglist=homeService.search_title(title);
		return new ModelAndView("home","list",bloglist);
		
	}
	
	@RequestMapping("/search_title1")
	public ModelAndView searcht1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","mdt30",blog.toString());
		
	}
	@RequestMapping(value="/search_category")
	public ModelAndView searchc(@RequestParam String category){
		System.out.println(category);
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.search_category(category);
		return new ModelAndView("home","list1",bloglist1);
		
	}
	
	@RequestMapping("/search_category1")
	public ModelAndView searchc1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","mdt40",blog.toString());
		
	}
	
	@RequestMapping(value = "/search_author")
	public ModelAndView searcha(@RequestParam String author){
		System.out.println(author);
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.search_author(author);
		return new ModelAndView("home","list2",bloglist1);
		
		
	}
	
	
	@RequestMapping("/search_author1")
	public ModelAndView searcha1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","mdt50",blog.toString());
		
	}
	
	@RequestMapping(value="/blogs",method=RequestMethod.GET)
	public ModelAndView viewb(){
		ModelAndView mav=new ModelAndView();
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.view_blog();
		mav= new ModelAndView("home","list3",bloglist1);
		return mav;
	}
	@RequestMapping(value="/open_blogu1",method=RequestMethod.GET)
	public ModelAndView openu(HttpServletRequest request,HttpServletResponse res){
		 factory=request.getSession();
		 ModelAndView mav = new ModelAndView();
		    int id=Integer.parseInt(request.getParameter("id"));
		   // Blog b=new Blog();
		   // b.setBlogId(id);
		   // factory.setAttribute("blogId", id);
			ArrayList<Blog> bloglist1=new ArrayList<Blog>();
			bloglist1=homeService.open_blog(id);
			mav= new ModelAndView("blogdetailsforuser","list4",bloglist1);
			return mav;
		
	}
	
	@RequestMapping(value="/view_blog",method=RequestMethod.GET)
	public ModelAndView viewb1(){
		ModelAndView mav=new ModelAndView();
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.view_blog();		
		mav= new ModelAndView("home","list3",bloglist1);
		return mav;
		
		
	}
	
	
	@RequestMapping(value="/open_blogu",method=RequestMethod.GET)
	public ModelAndView openu1(HttpServletRequest request,HttpServletResponse res){
		//System.out.println(blogId);
		//BlogDAO b1=new BlogImple();
	    factory=request.getSession();
	    int id=Integer.parseInt(request.getParameter("id"));
	   // Blog b=new Blog();
	   // b.setBlogId(id);
	   // factory.setAttribute("blogId", id);
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.open_blog(id);
		return new ModelAndView("simpleblog","list4",bloglist1);
	
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
