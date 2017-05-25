<%--
  Created by IntelliJ IDEA.
  User: lingdeqin
  Date: 17-5-24
  Time: 下午10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>用户信息列表</title>
</head>
<body>
<c:if test="${!empty userList}">
    <c:forEach var="user" items="${userList}">
        姓名：${user.name} &nbsp;&nbsp;手机号：${user.password} &nbsp;&nbsp;&nbsp;<br>
    </c:forEach>
</c:if>
</body>
</html>
