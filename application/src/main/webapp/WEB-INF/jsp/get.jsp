<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: shunly
  Date: 2017/10/17
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
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
            <tr>
                <td>${get.id}</td><%--get是Controller返回的model名称--%>
                <td>${get.name}</td>
                <td>${get.qq}</td>
                <td>${get.onlineId}</td>
            </tr>
    </table>
    <a href="list.jsp"/>
</div>
</tbody>
</html>
