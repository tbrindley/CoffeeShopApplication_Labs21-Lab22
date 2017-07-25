<%--
  Created by IntelliJ IDEA.
  User: travis
  Date: 7/21/2017
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome ${user}</title>

    <link rel="stylesheet" type="text/css" href="../../webresources/css/mainStyle.css">
    <script src="../../webresources/javascript/scripts.js"></script>
</head>
<body onload="setDisplayNone()">
<div id="header">
    Grand Circus Cafe
</div>
<div id="content">
    <div id="left">

        <center>
            <p style="font-weight: bold">Menu Features</p>
        </center>

        <button type="button" class="button" onclick="showall()">All Items</button><br>
        <button type="button" class="button" onclick="displayButtons('drinks')">Drinks</button><br>
        <button type="button" class="button" onclick="displayButtons('snacks')">Snacks</button><br>
        <button type="button" class="button" onclick="displayButtons('meals')">Meals</button><br>
        <br>
        <button type="button" class="button" onclick="displayButtons('cart')">View Cart</button><br>
        <br>
        <center>
        <p style="font-weight: bold">Admin Features</p>
        </center>
        <button type="button" class="button" onclick="displayButtons('addUser')">Add User</button><br>
    </div>

    <div id="right">

        <fieldset id="drinks">
            <p> Drinks</p>
            <button id="blackCoffee" class="menubutton" onclick="addToCart('Black Coffee', .99)">Black Coffee <br> $0.99
            </button>
            <button id="mocha" class="menubutton" onclick="addToCart('Mocha', 4.99)">Mocha<br> $4.99</button>
            <button id="espresso" class="menubutton" onclick="addToCart('Espresso', 4.99)">Espresso<br> $4.99</button>
            <button id="cappuccino" class="menubutton" onclick="addToCart('Cappuccino', 5.99)">Cappuccino<br> $5.99
            </button>
        </fieldset>

        <fieldset id="snacks">
            <p> Snacks</p>
            <button id="donut" class="menubutton" onclick="addToCart('Donut', .50)">Donut<br> $0.50</button>
            <button id="bagel" class="menubutton" onclick="addToCart('Bagel', 4.99)">Bagel<br> $0.99</button>
            <button id="muffin" class="menubutton" onclick="addToCart('Muffin', 4.99)">Muffin<br> $1.25</button>
            <button id="fruit" class="menubutton" onclick="addToCart('Fruit', 4.99)">Fruit<br> $0.99</button>
        </fieldset>

        <fieldset id="meals">
            <p> Meals</p>
            <button id="eggcheese" class="menubutton" onclick="addToCart('Egg & Cheese ', 8.99)">Egg and Cheese Sandwich<br>
                $8.99
            </button>
            <button id="hamcheese" class="menubutton" onclick="addToCart('Ham & Cheese', 9.99)">Ham and Cheese
                Sandwich<br> $9.99
            </button>
            <button id="baconegg" class="menubutton" onclick="addToCart('Bacon & Egg', 4.99)">Bacon and Egg Sandwich<br>
                $8.99
            </button>
            <button id="works" class="menubutton" onclick="addToCart('The Works', 11.99)"><br>The Works Sandwich<br>
                $11.99
            </button>
        </fieldset>
        <div id="cart">
            <h3>Cart</h3>
        </div>
        <div id="addUser">
            <center><h3>Add User</h3></center>
            <form name="addUser" method="post" action="/addUser" onsubmit="return verifyAddUser()">
                <p><label>First Name:</label>
                <input type="text" name="firstname" required><br>
                <p><label>Last Name:</label>
                <input type="text" name="lastname" required><br>
                <p> <label>Email:</label>
                <input type="email" name="email" required><br>
                <p><label>Phone Number:</label>
                <input type="tel" name="tel" required><br>
                <p><label>Password:</label>
                <input type="password" name="password" required><br>
                <p><label>Confirm Password:</label>
                <input type="password" name="confirmPassword" required><br>
                <p><center> <input type="submit" value="Create User"></center>
            </form>
        </div>
    </div>
</div>

<div id="footer">
    <div id="footerRight">
        $<span id="total">0.00</span>
    </div>
    <div id="footerLeft">
        Total:
    </div>
</div>
</body>
</html>
