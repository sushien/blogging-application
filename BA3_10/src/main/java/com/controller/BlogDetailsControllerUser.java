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
import com.model.Comments;
import com.model.User;
import com.service.CommentService;
import com.service.HomeService;

@Controller
public class BlogDetailsControllerUser {
	
	@Autowired 
	private CommentService commentService1;
	@Autowired 
	private HomeService homeService;
	@Autowired
	private HttpSession factory;

	/*@RequestMapping("/add_comment")
	public ModelAndView detail1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("addcomments","mdu1",blog.toString());
		
	}*/
	
	@RequestMapping(value="/add_comment",method=RequestMethod.GET)
	public ModelAndView addComment(HttpServletRequest request,HttpServletResponse res){
		 factory=request.getSession();
		 int id=Integer.parseInt(request.getParameter("id"));
		 String comment=request.getParameter("comment");
		 Blog blog=new Blog();
		 blog.setBlogId(id);
		 User u=new User();
		 u.setUsername(factory.getAttribute("username").toString());
		Comments c = new Comments();
		c.setBlog(blog);
		c.setComments(comment);
		c.setUser(u);
		System.out.println(c.getComments());
		System.out.println(c.getBlog().getBlogId());
		System.out.println(c.getUser().getUsername());
		commentService1.createcomment(c);
		ArrayList<Blog> bloglist1=new ArrayList<Blog>();
		bloglist1=homeService.open_blog(id);		
		return new ModelAndView("blogdetailsforuser","list4",bloglist1);
	}


	/*@RequestMapping("/del_comment")
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
