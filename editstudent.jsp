<%--
  Created by IntelliJ IDEA.
  User: ray
  Date: 01/06/2024
  Time: 2:04 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Student</title>
</head>
<body>
    <h1>Edit Student</h1>
    <p>Are you sure you want to edit this student?</p>
    <form action="editsave/${student.id}" method="post">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" value="${student.name}" /></td>
            </tr>
            <tr>
                <td>Course:</td>
                <td><input type="text" name="course" value="${student.course}" /></td>
            </tr>
            <tr>
                <td>Course Code:</td>
                <td><input type="text" name="courseCode" value="${student.courseCode}" /></td>
            </tr>
            <tr>
                <td>Credits:</td>
                <td><input type="text" name="credits" value="${student.credits}" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Yes, edit" /></td>
            </tr>
        </table>
    </form>
    <a href="viewstudent.jsp">No, go back</a>
</body>
</html>