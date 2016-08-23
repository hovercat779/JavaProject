<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer registration page</title>
</head>
<body>

<form action="<c:url value='/registration' />" method="post">
    Company: <input type="text" name="company" value=""/><br>
    Company's rep: <input type="text" name="custRep" value=""/><br>
    Credit limit: <input type="text" name="creditLimit" value=""/><br>

    <input type="submit" value="Submit"/> <br>
</form>

<input type="submit" value="registration"/> <br>

<form action="<c:url value='index.jsp'/>" method="post">
    <input type="submit" value="back">
</form>


</body>
</html>
