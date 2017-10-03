package com.controller;

import java.util.ArrayList;

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

//Controller for Blogs of user
@Controller
public class BlogDetailsControllerUser {

	@Autowired 
	private CommentService commentService1;
	
	@Autowired 
	private HomeService homeService;
	
	@Autowired
	private HttpSession factory;

	//Add comment from User
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

    /*//delete comment from user
	@RequestMapping("/del_comment")
	public ModelAndView detail2(){		
		return new ModelAndView("deletecomments");
	}

	//view comments
	@RequestMapping("/view_comment")
	public ModelAndView detail3(){
		return new ModelAndView("viewcomments");

	}

	//Add ratings from user
	@RequestMapping("/add_rating")
	public ModelAndView detail4(){		
		return new ModelAndView("viewcomments");

	}*/

}
