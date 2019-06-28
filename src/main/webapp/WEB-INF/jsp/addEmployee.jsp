<%--
  Created by IntelliJ IDEA.
  User: znaji
  Date: 25/06/2019
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD EMPLOYEE FORM</title>
</head>
<body>
<h1>ADD EMPLOYEE</h1>
<div>
    <form action="saveEmployee" method="post">
        NAME: <input type="text" name="name"><br>
        SALARY: <input type="number" name="salary" ><br>
        RESUME: <input type="tex" name="resume"><br>
        <input type="submit" value="VALIDATE">
    </form>
</div>
</body>
</html>
