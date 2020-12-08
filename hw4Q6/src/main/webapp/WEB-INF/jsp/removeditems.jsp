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
	<h4>The following item removed from your cart successfully. </h4>
	<br/>
		<form method ="post" action="addselection.htm" id = "successform">
			<ul>
 			<c:forEach items = "${sessionScope.addedItems}" var = "item">
	 			<div class = "row">			
				<LI>${item.item}</LI>
				</div>
 			</c:forEach>
 			</ul>
		<div class = "row">
		Select any option to continue shopping  :<span style="display:inline-block; width: 10px;"></span><a href ="books.htm">  Books  </a><span style="display:inline-block; width: 10px;"></span> <a href ="music.htm">  Music  </a><span style="display:inline-block; width: 10px;"></span> <a href ="computers.htm">  Computers </a> 
		</div>
		</form>
	</div>
</body>
</html>