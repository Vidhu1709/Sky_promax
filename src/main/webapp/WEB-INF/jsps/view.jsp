<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passengers Ticket Booking</title>
</head>
<body bgcolor="pink">
<center>
<h1>PASSENGERS TICKET BOOKING</h1>
<form action="save" method="post">
<pre>
       First Name: <input type="text" name="fname"/>

        Last Name: <input type="text" name="lname"/>

            Email: <input type="text" name="email"/>

           Mobile: <input type="text" name="mobile"/>

Departure Airport: <input type="text" name="depair"/>

  Arrival Airport: <input type="text" name="arrair"/>

       <input type="submit" value="Book Ticket"/>

</pre>



</form>


</center>

</body>
</html>