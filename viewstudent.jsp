<%--
  Created by IntelliJ IDEA.
  User: ray
  Date: 01/06/2024
  Time: 2:03 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title>View Students</title>
</head>
<body>
    <h1>Students</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Course</th>
            <th>Course Code</th>
            <th>Credits</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="student" items="${list}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.course}</td>
                <td>${student.courseCode}</td>
                <td>${student.credits}</td>
            <td>
                 <a href="editstudent/${student.id}">Edit</a>
                 <form action="deletestudent/${student.id}" method="post">
                    <input type="submit" value="Delete">
                  </form>
            </td>

            </tr>
        </c:forEach>
    </table>
</body>
</html>