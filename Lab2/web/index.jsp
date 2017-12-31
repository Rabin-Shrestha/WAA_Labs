<%--
  Created by IntelliJ IDEA.
  User: Rabin Shrestha
  Date: 11/1/2017
  Time: 5:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lab 2 : Warking with HttpSession</title>
</head>
<body>
<h3>Lab 2 : Rabin Shrestha</h3>
<br>

<form action="/person/">
    <input type="submit" value="List Names" />
</form>
<br>
<h3>Addd Person :</h3> <br>
<br>
<form name="addNameForm" method="post" action="/person/add">
    <label>First Name :</label><input type="text" name="fName"/>
    <label>Last Name :</label><input type="text" name="lName"/>
    <input type="submit" value="Add Person">
</form>

<hr>

<h2>Delete Person :</h2>
<form name="delNameForm" method="post" action="/person/delete">
    <label>Key : </label> <input type="text" name="removeKey">
    <input type="submit" value="Delete">
</form>
<hr>
<h2>List of Name :</h2>


</body>
</html>
