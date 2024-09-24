<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Passengers details</title>
</head>
<body bgcolor="pink">
<center>
<h1> UPDATE PASSENGERS DETAILS</h1>
<form action="updatepassdata" method="post">
<pre>
                 
                  
                  <input type="hidden" name="id" value="${passde.id}"/>
                  
       First Name: <input type="text" name="fname" value="${passde.fname}"/>

        Last Name: <input type="text" name="lname" value="${passde.lname}"/>

            Email: <input type="text" name="email" value="${passde.email}"/>

           Mobile: <input type="text" name="mobile"value="${passde.mobile}"/>

Departure Airport: <input type="text" name="depair" value="${passde.depair}" />

  Arrival Airport: <input type="text" name="arrair" value="${passde.arrair}"/>

       <input type="submit" value="Book Ticket"/>

</pre>



</form>


</center>

</body>
</html>