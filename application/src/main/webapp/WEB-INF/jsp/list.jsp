<meta charset="UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title>springmvc、spring、mybatis集成例子</title>
</head>
<div class="container-wrap">
    <table class="table table-hover">
        <tr class="active">
        <td><strong>id</strong></td>
        <td><strong>姓名</strong></td>
        <td><strong>qq</strong></td>
        <td><strong>学号</strong></td>
        </tr>
        <c:forEach items="${list}" var="ap">
        <tr>
           <td>${ap.id}</td>
           <td>${ap.name}</td>
           <td>${ap.qq}</td>
           <td>${ap.onlineId}</td>
            <td>
                <form method="post" action="/application/id/{id}">
                    <input type="hidden" name="_method" value="DELETE">
                    <input type="submit" value="DELETE">
                </form>
            </td>
        </tr>
        </c:forEach>
    </table>
    <div>
        <a href="/application/application/new">添加</a>
    </div>
</div>
</html>
