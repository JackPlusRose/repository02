<%--
  Created by IntelliJ IDEA.
  User: Jack
  Date: 2019/8/13
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="account">
    ${account.aid}&nbsp;&nbsp;${account.userName}&nbsp;&nbsp;${account.money}<br>
</c:forEach>
</body>
</html>
