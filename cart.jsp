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
            <h2>Cart</h2>
            <p>Here is a list of all the items in your cart!</p>
            <br>
            <%= table  %>
            <br>
            <p>Remove From Cart :</p>
            <form name="renoveFromCartForm" action="doRemoveFromCart" method=post>
                <table>
                    <tr>
                        <td><label>Item Name</label></td>
                        <td><select name="productID" required>
						    <option value="1">Wine</option>
						    <option value="2">Cheese</option>
						    <option value="3">Spices</option>
						    <option value="4">Chex Mix</option>
						    <option value="5">Cereal</option>
						    <option value="6">Veggies</option>
						 	</select></td>
                    </tr>
                </table>
                <br>
                <input id="submitButton" type="submit" name="submitButton" value="Remove" />
                <br>
            </form>
		<form name="exit" action="exit.jsp">
            <input id="submitButton" type="submit" name="exitButton" value="CheckOut" />
            </form>
        </div>

    </div>
</div>
</body>
</html> 
