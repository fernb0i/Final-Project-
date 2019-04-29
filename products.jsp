<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    
   	String table = (String) request.getAttribute("table");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<div class="sidenav">
    <img src="resources/pig_logo.png">
    <a href="register">Register</a>
    <a href="login">View Products</a>
    <a href="cartLogin">Shopping Cart</a>
</div>

<div class="main">
    <div id="title">Wiggly Piggly!</div>
    <div id="content">
        <div id="section1">
            <h2>Products</h2>
            <p>Select from our list of delicious products below! </p>
            <br>
            <%= table  %>
            <br>
            <a href="add">Add a product</a>
        </div>

    </div>
</div>
</body>
</html> 