<%--
  Created by IntelliJ IDEA.
  User: ray
  Date: 01/06/2024
  Time: 2:03 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
    <h1>Add Student</h1>
    <p>Are you sure you want to add this student?</p>
    <form action="save" method="post">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" /></td>
            </tr>
            <tr>
                <td>Course:</td>
                <td><input type="text" name="course" /></td>
            </tr>
            <tr>
                <td>Course Code:</td>
                <td><input type="text" name="courseCode" /></td>
            </tr>
            <tr>
                <td>Credits:</td>
                <td><input type="text" name="credits" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Yes, add" /></td>
            </tr>
        </table>
    </form>
    <a href="viewstudent.jsp">No, go back</a>
</body>
</html>