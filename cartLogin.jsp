<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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
            <h2>login Now!</h2>
            <p>Please enter your credentials to view our products!</p>
        </div>
        <div id="form">
            <form name="loginForm" action="doCartLogin" method=post>
                <table>
                    <tr>
                        <td><label>Username: </label></td>
                        <td><input type="text" name="username" required /></td>
                    </tr>
                    <tr>
                        <td><label>Password: </label>
                        <td><input type="password" name="password" required /></td>
                    </tr>
                </table>
                <input id="submitButton" type="submit" name="submitButton" value="Login" />
                <br><br>
                <%= request.getAttribute("errorMessage") %>
            </form>
            <br>
        </div>
    </div>
</div>
</body>
</html> 