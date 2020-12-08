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
    <li class="nav-item  ">
      <a class="nav-link" href="books.htm">Books</a>
    </li>
    <li class="nav-item active">
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
		<form method ="post" action="addselection.htm" id = "musicform">
			<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="I am going to tell you a secret by Maddona"> I am going to tell you a secret by Maddona [$29.50]
			</fieldset>
			</div> 
			<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="Baby one more time by Britney Spears"> Baby one more time by Britney Spears [$98.50]
			</fieldset>
			</div>       
        	<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="Justified by Justin Timberlake"> Justified by Justin Timberlake  [$40.59]
			</fieldset>
			</div>   
 			<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="Loss by Nelli Futado"> Loss by Nelli Futado [$82.50]
			</fieldset>
			</div>   
			<div class = "row">			
			<fieldset class = "form-group">
			<input type="checkbox"  name="cart" value="Gold digger by Kanye West"> Gold digger by Kanye West [$66.90]
			</fieldset>
			</div>          
		
			<button type = "submit" class = "btn btn-success" value="Add to Cart">Add to Cart</button>	

		</form>
	</div>
</body>
</html>