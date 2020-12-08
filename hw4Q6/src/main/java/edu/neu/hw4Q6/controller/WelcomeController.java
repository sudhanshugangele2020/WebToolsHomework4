package edu.neu.hw4Q6.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	    @RequestMapping(value = "/", method = RequestMethod.GET)
		public String helloPage( ModelMap model,HttpServletRequest request) throws Exception {
			System.out.println("reachedinside of welcome get dfd");
			model.put("name1", getLoggedinUserName());
			HttpSession session  = request.getSession();
			session.setAttribute("name", getLoggedinUserName());
			System.out.println("in here welcomrcontroller get");
			System.out.println("my contextpath in welcome controller is "+request.getContextPath() );
			System.out.println("my uri in welcome controller is "+request.getRequestURI());
			System.out.println("my contextpath in welcome controller is "+request.getMethod());
			System.out.println("my contextpath in welcome controller is "+request.getUserPrincipal().getName() );
			System.out.println("my contextpath in welcome controller is "+request.getServletPath() );
			System.out.println("my contextpath in welcome controller is "+request.getServletContext().getServletContextName());
			return "welcome";
		}
		
		private String getLoggedinUserName() {
			System.out.println("inside method");
			Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			System.out.println(principal.toString()+" is principal");
			
			if(principal instanceof UserDetails) {
				return ((UserDetails)principal).getUsername();
			}
			System.out.println("username is"+principal.toString());
			
			return principal.toString();
			
		}

	}

	


