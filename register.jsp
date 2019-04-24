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
    <a href="#about">Register</a>
    <a href="#services">View Products</a>
    <a href="#clients">Shopping Cart</a>
</div>

<div class="main">
    <div id="title">Wiggly Piggly!</div>
    <div id="content">
        <div id="section1">
            <h2>Register Now!</h2>
            <p>Members gain great perks like full access to our store and monthly coupons! </p>
        </div>
        <div id="form">
            <form name="creditForm" action="doPaymentSchedule" method=get>
                <table>
                    <tr>
                        <td><label>First Name :</label></td>
                        <td><input type="text" name="firstName" /></td>
                    </tr>
                    <tr>
                        <td><label>Last Name :</label>
                        <td><input type="text" name="lastName" /></td>
                    </tr>
                    <tr>
                        <td><label>Phone # :</label>
                        <td><input type="text" name="phoneNum" /></td>
                    </tr>
                    <tr>
                        <td><label>Email :</label>
                        <td><input type="text" name="email" /></td>
                    </tr>
                </table>
                <input id="submitButton" type="submit" name="submitButton" value="Register" />
            </form>
            <br>
        </div>
    </div>
</div>
</body>
</html> 