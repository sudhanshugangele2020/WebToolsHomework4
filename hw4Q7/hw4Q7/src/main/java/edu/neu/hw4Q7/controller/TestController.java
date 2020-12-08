package edu.neu.hw4Q7.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import edu.neu.hw4Q7.model.Test;



//@Controller
//public class TestController {
//	
//	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//	Test tt = context.getBean("test",Test.class);
//	
//    @RequestMapping(value = "/check.htm", method = RequestMethod.GET)
//	public String checkMessage(HttpServletRequest request) {
//    	request.setAttribute("myobject", tt);
//    	return "success";
//    }


public class TestController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		Test tt = getApplicationContext().getBean("test",Test.class);
		ModelAndView mv = new ModelAndView("success", "myobject", tt);
		return mv;
	}
}
