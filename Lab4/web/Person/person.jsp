<%--
  Created by IntelliJ IDEA.
  User: Rabin Shrestha
  Date: 11/16/2017
  Time: 3:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html><body>
<h3>Lab 4 : Rabin Shrestha</h3>
<br>
<h2> Name List on Session :</h2><br>
<%--${personList}--%>
<c:if test="${empty personList}">
    Sorry there is no person in Session
</c:if>

<c:if test="${not empty errorMessage}">
    <label style="color: red"> Error : ${errorMessage}</label><br>
</c:if>

<c:if test="${not empty personList}">
        <table border="2px" style="margin: 5px">
        <th>SN</th><th>Name</th>
        <c:forEach items="${personList}" var="personMap" >
        <tr>
            <td>${personMap.key}</td>
            <td>${personMap.value.firstName} ${personMap.value.lastName}</td>
        </tr>
        </c:forEach>
        </table>
</c:if>

<form action="/person/">
    <input type="submit" value="Reload Name List Names" />
</form>

<br><h2>Add Person :</h2> <br>

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



</body></html>