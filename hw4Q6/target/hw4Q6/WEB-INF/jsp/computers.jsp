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
    <li class="nav-item ">
      <a class="nav-link" href="/hw3Q6/books.jsp">Books</a>
    </li>
    <li class="nav-item ">
      <a class="nav-link" href="/hw3Q6/music.jsp">Music</a>
    </li>
    <li class="nav-item active " >
      <a class="nav-link " href="/hw3Q6/computers.jsp">Computers</a>
    </li>
   
    <li class="nav-item ">      
      <a class="nav-link " href="/hw3Q6/viewcart" id = "cart">View Cart</a>      
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
		<form method ="post" action="addselection" id = "computerform">
			<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="Apple MacBook Pro with 13.3 display "> Apple MacBook Pro with 13.3" display [$1229.50]
			</fieldset>
			</div> 
			<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="Asus Laptop with Centrio 2 black"> Asus Laptop with Centrio 2 black [$998.50]
			</fieldset>
			</div>       
        	<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="HP Pavilion Laptop with Centrio 2 black"> HP Pavilion Laptop with Centrio 2 black  [$840.59]
			</fieldset>
			</div>   
 			<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="Sony VAIO Laptop with Core Composition Black"> Sony VAIO Laptop with Core Composition Black [$766.90]
			</fieldset>
			</div>   
			<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="Toshiba Satellite Laptop with Centrio 2- Copper"> Toshiba Satellite Laptop with Centrio 2- Copper [$829.50]
			</fieldset>
			</div>          
				
	
			<button type = "submit" class = "btn btn-success" value="Add to Cart">Add to Cart</button>	

		</form>
	</div>
</body>
</html>