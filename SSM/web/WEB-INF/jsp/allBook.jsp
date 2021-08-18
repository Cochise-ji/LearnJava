<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86180
  Date: 2021/8/2
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AA书籍展示AA</title>
</head>
<body>
<c:forEach var="book" items="${list}">
<h1>${book.bookName}</h1>
    <br>
<h1>${book.detail}</h1>
</c:forEach>
</body>
</html>
