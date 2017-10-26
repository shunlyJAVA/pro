<%--
  Created by IntelliJ IDEA.
  User: shunly
  Date: 2017/10/17
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" action="/application/new">
        <table>
            <tr><td>姓名</td><td><input name="name" ></td></tr>
            <tr><td>qq</td><td><input name="qq" ></td></tr>
            <tr><td>修真类型</td><td><input name="position" ></td></tr>
            <tr><td>入学时间</td><td><input name="time" ></td></tr>
            <tr><td>毕业学校</td><td><input name="college" ></td></tr>
            <tr><td>学号</td><td><input name="onlineId" ></td></tr>
            <tr><td>日报</td><td><input name="url" ></td></tr>
            <tr><td>立志</td><td><input name="ambition" ></td></tr>
            <tr><td>师兄</td><td><input name="senior" ></td></tr>
            <tr><td>从何处得知</td><td><input name="info" ></td></tr>
            <tr><td><input type="submit" value="提交"></td></tr>
        </table>
        <a href="list.jsp"  >返回</a>
    </form>
</body>
</html>
