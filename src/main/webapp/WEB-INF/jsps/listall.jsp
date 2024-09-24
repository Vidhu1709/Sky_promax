<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of all Passengers</title>
</head>
<body bgcolor="lightblue">

<h1>LIST OF ALL PASSENGERS</h1>
<table border=2>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>mobile</th>
<th>Departure Airport</th>
<th>Arrival Airport</th>
<th>delete</th>
<th>update</th>
</tr>
<c:forEach var="passdata" items="${passdata}">
<tr>
<td>${passdata.fname}</td>
<td>${passdata.lname}</td>
<td>${passdata.email}</td>
<td>${passdata.mobile}</td>
<td>${passdata.depair}</td>
<td>${passdata.arrair}</td>
<td><a href="deletepass?id=${passdata.id}">delete</a></td>
<td><a href="updatepass?id=${passdata.id}">Update</a></td>




</c:forEach>



</table>

</body>
</html>