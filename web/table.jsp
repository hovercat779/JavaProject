<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Data page</title>
</head>
<body>

<form action="<c:url value="/index.jsp"/>" method="post">
    <input type="submit" value="first page"/>
</form>

<table border="1">
    <td>Customer ID</td>
    <td>Company</td>
    <td>Company's rep</td>
    <td>Credit limit</td>

    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.getCustNum()}"/></td>
            <td><c:out value="${user.getCompany()}"/></td>
            <td><c:out value="${user.getCustRep()}"/></td>
            <td><c:out value="${user.getCreditLimit()}"/></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
