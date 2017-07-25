<%--
  Created by IntelliJ IDEA.
  User: travi
  Date: 7/21/2017
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="../../webresources/css/style.css">
    <script src="../../webresources/javascript/scripts.js"></script>
    <title>Grand Circus - Point of Sales System</title>
    <meta charset="UTF-8">
</head>
<body>
<div id="header">
</div>
<div id="content">
    <img src=".../../webresources/img/grand_circus.png">
    <form name="loginForm" action="/posSystem" onsubmit="return validateLogin()" method="post">
        USERNAME:<br>
        <input type="text" name="email" value="" class="textarea" required>
        <br>
        <span style="color: red;">${invalid}</span><br>
        PASSWORD:<br>
        <input type="password" name="password" value="" class="textarea" required>
        <br><br>
        <input type="submit" value="Login">

    </form>
</div>
<div id="footer">
</div>
</body>
</html>
