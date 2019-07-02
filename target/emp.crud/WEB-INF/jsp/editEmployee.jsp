<%--
  Created by IntelliJ IDEA.
  User: znaji
  Date: 28/06/2019
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EDIT EMPLOYEE</title>
</head>
<body>
<h1>EDIT EMPLOYEE</h1>
<div>
    <form action="updateEmployee" method="post">
        NAME: <input type="text" name="name" value="${employee.name}"><br>
        SALARY: <input type="number" name="salary" value="${employee.salary}"><br>
        RESUME: <input type="tex" name="resume" value="${employee.resume}"><br>
                <input type="hidden" name="id" value="${employee.id}">
        <input type="submit" value="VALIDATE" >
    </form>
</div>
</body>
</html>
