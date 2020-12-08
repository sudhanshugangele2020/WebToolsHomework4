<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
 <%@ page session = "true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="#"> Hello ${sessionScope.name}</a>

  <!-- Links -->
  <div class="navbar-collapse">

  <ul class="navbar-nav" >
    <li class="nav-item active ">
      <a class="nav-link" href="books.htm">Books</a>
    </li>
    <li class="nav-item ">
      <a class="nav-link" href="music.htm">Music</a>
    </li>
    <li class="nav-item " >
      <a class="nav-link " href="computers.htm">Computers</a>
    </li>
   
    <li class="nav-item ">      
      <a class="nav-link " href="viewcart.htm" id = "cart">View Cart</a>      
    </li>
 
  </ul>

  </div>
</nav>


	<div class="container">
	<br/>
	<br/>
	<br/>
	<h4>Choose from Below Items :</h4>
	<br/>
		<form method ="post" action="addselection.htm" ">
			<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="Java Servlet Programming"> Java Servlet Programming [$29.50]
			</fieldset>
			</div> 
			<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="Oracle Database Programming"> Oracle Database Programming [$48.50]
			</fieldset>
			</div>       
        	<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="System Analysis & Design using UML"> System Analysis & Design using UML [$14.59]
			</fieldset>
			</div>   
 			<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="Object oriented Software Engineering"> Object oriented Software Engineering [$29.50]
			</fieldset>
			</div>   
			<div class = "row">			
			<fieldset class = "form-group">
			 <input type="checkbox"  name="cart" value="Java Web Services"> Java Web Services [$26.90]
			</fieldset>
			</div>          
					
			<button type = "submit" class = "btn btn-success" value="Add to Cart">Add to Cart</button>	
		
		<%

		System.out.println("Session id in books.jsp is  :"+session.getId());
    	System.out.println("in books.jsp  ");
		System.out.println("my contextpath in welcome controller is "+request.getContextPath() );
		System.out.println("my uri in welcome controller is "+request.getRequestURI());
		System.out.println("my contextpath in welcome controller is "+request.getMethod());
		System.out.println("my contextpath in welcome controller is "+request.getUserPrincipal().getName() );
		System.out.println("my contextpath in welcome controller is "+request.getServletPath() );
		System.out.println("my contextpath in welcome controller is "+request.getServletContext().getServletContextName());
		%>
		</form>
	</div>
</body>
</html>