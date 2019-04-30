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
            <p>Add to Cart:</p>
            <form name="addToCartForm" action="doAddToCart" method=post>
                <table>
                    <tr>
                        <td><label>Item Name</label></td>
                        <td><select name="productID">
						    <option value="1">Wine</option>
						    <option value="2">Cheese</option>
						    <option value="3">Spices</option>
						    <option value="4">Chex Mix</option>
						    <option value="5">Cereal</option>
						    <option value="6">Veggies</option>
						 	</select></td>
                    </tr>
                    <tr>
                        <td><label>Quantity</label></td>
                        <td><input type="number" name="quantity" min="1" max="30"></td>
                    </tr>
                </table>
                <input id="submitButton" type="submit" name="submitButton" value="Add to Cart" />
            </form>
        </div>
    </div>
</div>
</body>
</html> 
