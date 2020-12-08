package edu.neu.hw4Q6.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import edu.neu.hw4Q6.config.ApplicationConfig;
import edu.neu.hw4Q6.model.UserProduct;
import edu.neu.hw4Q6.service.ShoppingService;




/**
 * Servlet implementation class BookServlet
 */
//@WebServlet(urlPatterns = {"/addselection","/viewcart"})
@Controller
public class ShopController{
	
	ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	private ShoppingService shoppingService =  context.getBean("shoppingService",ShoppingService.class);
	
	
	
    public ShopController() {
        super();
    }

    @RequestMapping(value = "/books.htm", method = RequestMethod.GET)
	public String booksPage(HttpServletRequest request) {
    	return "books";
    }
    
    @RequestMapping(value = "/music.htm", method = RequestMethod.GET)
	public String musicPage(HttpServletRequest request) {
    	return "music";
    }
    
    @RequestMapping(value = "/computers.htm", method = RequestMethod.GET)
	public String computersPage(HttpServletRequest request) {
    	return "computers";
    }
    
	@RequestMapping(value = "/addselection.htm", method = RequestMethod.GET)
	public String getAddSelection(HttpServletRequest request) {
		
		System.out.println("HALLELUYAH!!");
		int count = Integer.parseInt(request.getParameter("count"));
		System.out.println(shoppingService.hashCode());
		ArrayList<UserProduct> userProducts = new ArrayList<UserProduct>();		
		request.setAttribute("objectlist", userProducts);
		request.setAttribute("count", count);
		
		return "books-list";
	}
	
	@RequestMapping(value = "/viewcart.htm", method = RequestMethod.GET)
	public String getViewCart(HttpServletRequest request) {
		
    	System.out.println("Inside viewget ");		
		ArrayList<String> cartItems = shoppingService.viewCart(request.getSession().getAttribute("name").toString());
		System.out.println("cartItems is "+cartItems.size());
		if(cartItems.isEmpty()) {
			request.setAttribute("message", "There are no items in your Cart");				
		}else {
			request.setAttribute("cartitems", cartItems);			
		}		
		return "viewcart";
	}
	
	@PostMapping("/addselection.htm")
	public String postAddSelection(HttpServletRequest request) {
		
    	System.out.println("in addselection postmapping ");
		System.out.println("my contextpath in welcome controller is "+request.getContextPath() );
		System.out.println("my uri in welcome controller is "+request.getRequestURI());
		System.out.println("my contextpath in welcome controller is "+request.getMethod());
		System.out.println("my contextpath in welcome controller is "+request.getUserPrincipal().getName() );
		System.out.println("my contextpath in welcome controller is "+request.getServletPath() );
		System.out.println("my contextpath in welcome controller is "+request.getServletContext().getServletContextName());
		System.out.println("my contextpath in welcome controller is "+request.getPathInfo());
		System.out.println("my contextpath in welcome controller is "+request.getPathTranslated());

		System.out.println("my contextpath in welcome controller is "+request.getRemoteUser());
		if(request.getAttribute("noselection")=="true") {
			request.setAttribute("item", "notselected");
			System.out.println("my path find it out");
			return "welcome";
		}
  		String user = request.getSession().getAttribute("name").toString();
  		String[] itemsSelected = request.getParameterValues("cart");
  		
  		ArrayList<String> items = new ArrayList<>();
  		System.out.println("Length of input is :"+itemsSelected.length);
  		for(int i =0; i<itemsSelected.length; i++) {
  			items.add(itemsSelected[i]);
  			System.out.println("Incoming items are :"+itemsSelected[i]);
  		}
  		
  		ArrayList<UserProduct> addedItems= shoppingService.addItem(user, items);
  		HttpSession session  = request.getSession();
  		
  		if((addedItems ==null)||(addedItems.isEmpty())) {
  			request.setAttribute("process", "emptyadd");
  			request.setAttribute("message", "No new selections made for Shopping");
  		}else {
  			request.setAttribute("process", "add");
  		}
  		session.setAttribute("addedItems", addedItems);
  		
  		return "successcart";
	}
	
	@RequestMapping(value = "/viewcart.htm", method = RequestMethod.POST)
	public String postViewCart(HttpServletRequest request) {
    	System.out.println("Inside post for removing");
    	
		if(request.getAttribute("noselection")=="true") {
			request.setAttribute("item", "notselected");

			return "welcome";
		}
    	
    	String[] itemsSelected =  request.getParameterValues("Kart");
    	
		
  		ArrayList<String> removeItems = new ArrayList<>();
  		System.out.println("Length of input is :"+itemsSelected.length);
  		for(int i =0; i<itemsSelected.length; i++) {
  			removeItems.add(itemsSelected[i]);
  			System.out.println("To remove items are :"+itemsSelected[i]);
  		}
		
  		ArrayList<String> removedItems = shoppingService.removeCartItems(request.getSession().getAttribute("name").toString(),removeItems);

		if(removedItems==null) {
			request.setAttribute("message", "There are no items to remove");
			request.setAttribute("process", "emptyremove");
		}else {
			request.setAttribute("process", "remove");	
			
		}	
		request.setAttribute("cartitems", removedItems);
		
		return "successcart";
	}
		
}
