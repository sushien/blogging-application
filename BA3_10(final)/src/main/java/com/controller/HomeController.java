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

import com.model.Blog;
import com.service.HomeService;

//Home Controller
@Controller
public class HomeController {


	@Autowired 
	private HomeService homeService;

	@Autowired
	private HttpSession factory;

	//Controller for login 
	@RequestMapping("/login_blog")
	public ModelAndView login1(){		
		return new ModelAndView("login");		
	}

	//Controller for logout
	@RequestMapping("/logout")
	public ModelAndView logout(){
		return new ModelAndView("home");		
	}

	//Controller for register
	@RequestMapping("/register_blog")
	public ModelAndView register1(){
		return new ModelAndView("register");

	}

	//Search by title for visitor
	@RequestMapping(value = "/send_title")
	public ModelAndView searcht(@RequestParam String title){
		ArrayList<Blog> bloglist=new ArrayList<Blog>();
		bloglist=homeService.search_title(title);
		return new ModelAndView("home","list",bloglist);		
	}

	//Search by title for user
	@RequestMapping(value="/search_title1")
	public ModelAndView searcht1(@RequestParam String title){
		ArrayList<Blog> bloglist=new ArrayList<Blog>();
		bloglist=homeService.search_title(title);
		return new ModelAndView("homeafterregister","list",bloglist);		
	}
	
	//Search by category for visitor
	@RequestMapping(value="/search_category")
	public ModelAndView searchc(@RequestParam String category){
		System.out.println(category);
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.search_category(category);
		return new ModelAndView("home","list1",bloglist1);

	}

	//Search by category for user
	@RequestMapping(value="/search_category1")
	public ModelAndView searchc1(@RequestParam String category){
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.search_category(category);
		return new ModelAndView("homeafterregister","list1",bloglist1);

	}

	//Search by author for visitor
	@RequestMapping(value = "/search_author")
	public ModelAndView searcha(@RequestParam String author){
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.search_author(author);
		return new ModelAndView("home","list2",bloglist1);


	}

	//Search by author for user
	@RequestMapping(value="/search_author1")
	public ModelAndView searcha1(@RequestParam String author){
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.search_author(author);
		return new ModelAndView("homeafterregister","list2",bloglist1);

	}

	//List blogs for visitor
	@RequestMapping(value="/blogs",method=RequestMethod.GET)
	public ModelAndView viewb(){
		ModelAndView mav=new ModelAndView();
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.view_blog();
		mav= new ModelAndView("home","list3",bloglist1);
		return mav;
	}
	
	//Open Blog for user
	@RequestMapping(value="/open_blogu1",method=RequestMethod.GET)
	public ModelAndView openu(HttpServletRequest request,HttpServletResponse res){
		factory=request.getSession();
		ModelAndView mav = new ModelAndView();
		int id=Integer.parseInt(request.getParameter("id"));
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.open_blog(id);
		mav= new ModelAndView("blogdetailsforuser","list4",bloglist1);
		return mav;

	}

	//List Blog for user
	@RequestMapping(value="/view_blog1",method=RequestMethod.GET)
	public ModelAndView viewb1(){
		ModelAndView mav=new ModelAndView();
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.view_blog();		
		mav= new ModelAndView("homeafterregister","list3",bloglist1);
		return mav;
	}

    //Open blog for visitor
	@RequestMapping(value="/open_blogu",method=RequestMethod.GET)
	public ModelAndView openu1(HttpServletRequest request,HttpServletResponse res){
		factory=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.open_blog(id);
		return new ModelAndView("simpleblog","list4",bloglist1);

	}

	@RequestMapping("/your_blog")
	public ModelAndView yourblog(){
		return new ModelAndView("blog");
		
	}


}
