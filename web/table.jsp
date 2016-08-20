<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<form action="<c:url value="/index.jsp"/>" method="post">
    <input type="submit" value="first page"/>
</form>

<table border="1">
    <td>ID</td>

    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.getCustNum()}"/></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
