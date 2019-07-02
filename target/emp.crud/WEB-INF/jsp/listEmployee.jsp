<%--
  Created by IntelliJ IDEA.
  User: znaji
  Date: 28/06/2019
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>List Employees</title>
</head>
<body>
<h1>EMPLOYEES LIST:</h1>
<table border="2">
    <c:forEach var="emp" items="${listEmployee}" >
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.salary}</td>
            <td>${emp.resume}</td>
        </tr>
    </c:forEach>
</table>
<div><a href="/addEmployee">+Employee</a></div>
</body>
</html>
