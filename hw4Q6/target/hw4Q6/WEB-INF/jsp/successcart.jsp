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
      <a class="nav-link" href="/hw3Q6/books.jsp">Books</a>
    </li>
    <li class="nav-item ">
      <a class="nav-link" href="/hw3Q6/music.jsp">Music</a>
    </li>
    <li class="nav-item " >
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
	<br/>
		<form method ="post" action="addselection" id = "successform">
		
		<c:choose>
			<c:when test="${requestScope.process =='emptyremove'}">
			<% System.out.println("Inside emptyremove"); %>
				<h4>The following item added to your cart successfully. </h4>
			</c:when>
			<c:when test="${requestScope.process =='emptyadd'}">
			<% System.out.println("Inside emptyadd"); %>
				<h4> ${requestScope.message}</h4>
				<p style="color:orange;font-size:16px;">Only one item per person is allowed.</p>
			</c:when>
			<c:when test="${requestScope.process =='add'}">
			<% System.out.println("Inside add"); %>
			<h4>The following item added to your cart successfully. </h4>
			<p style="color:orange;font-size:16px;">Only one item per person is allowed.</p>
			<ul>
 			<c:forEach items = "${sessionScope.addedItems}" var = "item">
	 			<div class = "row">			
				<LI>${item.item}</LI>
				</div>
 			</c:forEach>
 			</ul>
 			</c:when>
 			
 			<c:when test="${requestScope.process =='remove'}">
 			<% System.out.println("Inside remove..."); %>
 			<h4>The following item removed from your cart successfully. </h4>
			<ul>
 			<c:forEach items = "${requestScope.cartitems}" var = "item">
	 			<div class = "row">			
				<LI>${item}</LI>
				</div>
 			</c:forEach>
 			</ul>
 			</c:when>
		</c:choose>

		<div class = "row">
		Select any option to continue shopping  :<span style="display:inline-block; width: 10px;"></span><a href ="/hw3Q6/books.jsp">  Books  </a><span style="display:inline-block; width: 10px;"></span> <a href ="/hw3Q6/music.jsp">  Music  </a><span style="display:inline-block; width: 10px;"></span> <a href ="/hw3Q6/computers.jsp">  Computers </a> 
		</div>
		</form>
	</div>
</body>
</html>