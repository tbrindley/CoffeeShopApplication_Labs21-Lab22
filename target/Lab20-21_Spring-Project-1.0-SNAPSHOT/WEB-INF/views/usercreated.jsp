<%--
  Created by IntelliJ IDEA.
  User: travi
  Date: 7/24/2017
  Time: 7:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Created!</title>
</head>
<body>
<h1>User Created</h1>
<p>First Name: ${firstname} </p>
<p>Last Name: ${lastname} </p>
<p>Email: ${email}</p>
<p>Tel: ${tel}</p>
<form>
    <input type="button" value="Return to POS System"
           onclick="window.location.href='/gohome'" />
</form>
</body>
</html>
