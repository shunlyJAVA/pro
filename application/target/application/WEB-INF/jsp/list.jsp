<meta charset="UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springmvc、spring、mybatis集成例子</title>
</head>
<tbody>
<div class="container-wrap">
<table class="table table-hover">
    <tr class="active">
        <td><strong>id</strong></td>
        <td><strong>姓名</strong></td>
        <td><strong>qq</strong></td>
        <td><strong>学号</strong></td>
    </tr>
    <c:forEach items="${list}" var="node">
       <tr>
           <td>${node.id}</td>
           <td>${node.name}</td>
           <td>${node.qq}</td>
           <td>${node.onlineId}</td>
       </tr>
    </c:forEach>
</table>
</div>
</tbody>
</html>
