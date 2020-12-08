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
    <li class="nav-item ">
      <a class="nav-link" href="music.htm">Music</a>
    </li>
    <li class="nav-item " >
      <a class="nav-link " href="computers.htm">Computers</a>
    </li>
   
    <li class="nav-item active">      
      <a class="nav-link " href="viewcart.htm" id = "cart">View Cart</a>      
    </li>
 
  </ul>

  </div>
</nav>


	<div class="container">
	<br/>
	<br/>
	<br/>
	

	<h4>Current Items in Your Cart</h4>
	<br/>
		<form method ="post" action="viewcart.htm" id = "cartform">
			<c:choose>
				<c:when test="${not empty requestScope.message}">
					<h4>"${requestScope.message}"</h4>
				</c:when>			
				<c:otherwise>
					<ul>
					<c:forEach items = "${cartitems}" var = "item">										
						<div class = "row"> 
							<input type = "checkbox" name="Kart" value="${item}"><span style="display:inline-block; width: 5px;" required></span>"${item}"
						</div>				
					</c:forEach> 
					</ul> 
				</c:otherwise>	
			</c:choose>	
       				
		<button type = "submit" class = "btn btn-success" value="Remove" >Remove</button>
		</form>
	</div>
</body>
</html>