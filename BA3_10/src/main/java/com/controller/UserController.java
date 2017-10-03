package com.controller;

import java.util.HashMap;
import java.util.Map;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDAO;
import com.dao.Impl.UserImple;
import com.model.Blog;
import com.model.User;
import com.service.UserService;
import com.service.UserServiceImpl;

@Controller 
public class UserController {

	/*@RequestMapping("/sign_in")
	public ModelAndView login1(){
		Map<String,String> modo = new HashMap();
		Blog blog=new Blog();
		blog.setBlogTitle("ketki");	
		modo.put("first", blog.toString());
		return new ModelAndView("homeafterregister","md",blog.toString());

	}*/

	//
	//@Qualifier(value="login")
	@Autowired 
	private UserService userService;
	@Autowired
	private HttpSession factory;

	/*@RequestMapping(value="/sign_in")
	public ModelAndView login1(HttpServletRequest request,HttpServletResponse res){
		String emailId=request.getParameter("email");  
        String password=request.getParameter("password");
        Boolean temp= userimple.checkLogin(emailId, password); 
        if(temp)
        {
        	return new ModelAndView("homeafterregister");
        }
        else
        {
        	return new ModelAndView("login");
        }


	}*/


	@RequestMapping(value = "/sign_in")
	public ModelAndView loginUser(HttpServletRequest request,HttpServletResponse res) {
		factory=request.getSession();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		/*UserDAO ud=new UserImple();
		User u=new User();
		u.setUsername(username);*/
		System.out.println("in controller"+username);
		System.out.println("in controller"+password);
		factory.setAttribute("username",username);
		if(username.equalsIgnoreCase("admin1") && password.equalsIgnoreCase("admin123"))
			return new ModelAndView("approve");
		boolean b=userService.checkLogin(username,password);      
		if(b)
			return new ModelAndView("homeafterregister");
		else
			return new ModelAndView("login");
	}

	@RequestMapping("/home")
	public ModelAndView home1(){

		return new ModelAndView("home");

	}

	@RequestMapping("/sign_up")
	public ModelAndView register1(){

		return new ModelAndView("register");

	}
	@RequestMapping("/go_to_login")
	public ModelAndView gotolog(){
		return new ModelAndView("login");

	}

	@RequestMapping("/go_to_home1")
	public ModelAndView gotohom(@RequestParam String username,@RequestParam String password,@RequestParam String email){
		User user=new User();
		ModelAndView mav=null;
		System.out.println(username);
		user.setEmailId(email);
		user.setUsername(username);
		user.setPassword(password);
		user.setUserType("user");
		userService.addUser(user);

		return new ModelAndView("login");
		//mav.addObject("registerMessage", "Registration Successfull !");

		//return mav;
	}

}
