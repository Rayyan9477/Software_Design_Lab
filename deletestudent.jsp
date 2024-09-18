<%--
  Created by IntelliJ IDEA.
  User: ray
  Date: 01/06/2024
  Time: 2:06 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Student</title>
</head>
<body>
    <h1>Delete Student</h1>
    <p>Are you sure you want to delete this student?</p>
    <form action="deletestudent/${student.id}" method="post">
        <input type="submit" value="Yes, delete">
    </form>
    <a href="viewstudent.jsp">No, go back</a>
</body>
</html>