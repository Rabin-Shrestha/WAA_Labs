<%@ page language="java" contentType="text/html" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    // Create an ArrayList with test data
    ArrayList list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    request.setAttribute("list", list);

%>

<html>
<head>
    <title> Lab 3:Using Jsp pages</title>
</head>
<body>
<h2> Hello World </h2>
<br>
<table border="2px">
    <TH>Choice List</th>
    <c:forEach items="${list}" var="current">
        <tr>
            <td><b><c:out value="${current}"/> </b></td>
        </tr>
    </c:forEach>
</table>


<c:if test="${Result!='' and Result!=null}"><label style="color: green">Success Message : ${Result}</label></c:if>

<label> Make your Random guess between 1 to 10 </label> <br>

<form method="post" action="/GuessNumber">
    <input type="hidden" name="randomval" value="${randomValue}">
    <label>Enter a number </label>
    <input type="number" name="guessedValue">
    <br>
    <input type="submit" value="Send">
</form>

</body>
</html>