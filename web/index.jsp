<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome page</title>
  </head>
  <body>

  Hello

  <form action="<c:url value='/table'/>" method="post">
    <input type="submit" value="table"/>
  </form>

  <form action="<c:url value='/registration'/>" method="post">
    <input type="submit" value="registration"/>
  </form>

  </body>
</html>
