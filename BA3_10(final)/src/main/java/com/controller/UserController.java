package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.model.User;
import com.service.UserService;

//User Controller
@Controller 
public class UserController {

	
	@Autowired 
	private UserService userService;
	@Autowired
	private HttpSession factory;

	//Controller for Signing in
	@RequestMapping(value = "/sign_in")
	public ModelAndView loginUser(HttpServletRequest request,HttpServletResponse res) {
		factory=request.getSession();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		factory.setAttribute("username",username);
		if(username.equalsIgnoreCase("admin1") && password.equalsIgnoreCase("admin123"))
			return new ModelAndView("approve");
		boolean b=userService.checkLogin(username,password);      
		if(b)
			return new ModelAndView("homeafterregister");
		else
			return new ModelAndView("login");
	}

	//Display current page
	@RequestMapping("/home")
	public ModelAndView home1(){

		return new ModelAndView("home");

	}

	//Redirect to registration page
	@RequestMapping("/sign_up")
	public ModelAndView register1(){
		return new ModelAndView("register");
	}
	
	//Redirect to login page
	@RequestMapping("/go_to_login")
	public ModelAndView gotolog(){
		return new ModelAndView("login");

	}

	//Redirect to home page after sign in
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
	}

}
