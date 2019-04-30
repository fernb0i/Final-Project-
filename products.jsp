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
						    <option value="1" style = "background-image:url('resources/wine.jpeg');">Wine</option>
						    <option value="2"style = "background-image:url('resources/cheese.jpg');">Cheese</option>
						    <option value="3"style = "background-image:url('resources/spices.jpg');">Spices</option>
						    <option value="4"style = "background-image:url('resources/snacks.jpg');">Chex Mix</option>
						    <option value="5"style = "background-image:url('resources/cereal.jpg');">Cereal</option>
						    <option value="6"style = "background-image:url('resources/produce.jpg');">Veggies</option>
						 	</select></td>
                    </tr>
                    <tr>
                        <td><label>Quantity</label></td>
                        <td><input type="number" name="quantity" min="1" max="30"></td>
                    </tr>
                </table>
                <input id="submitButton" type="submit" name="submitButton" value="Register" />
            </form>
        </div>
    </div>
</div>
</body>
</html> 
