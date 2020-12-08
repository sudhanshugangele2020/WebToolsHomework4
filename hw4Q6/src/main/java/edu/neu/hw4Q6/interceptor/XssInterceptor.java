package edu.neu.hw4Q6.interceptor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 *
 * @author Surya
 */
public class XssInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       
        try {
        	Enumeration<String> paramNames =request.getParameterNames();
        	System.out.println("XssCheck");
        	
        	if(!paramNames.hasMoreElements()) {       		
        			request.setAttribute("noselection", "true");
        			System.out.println(""+request.getAttribute("noselection"));
        	}
        }catch(Exception e) {
        	System.out.println(e);
        }
        
        return true;
    }
    
}
