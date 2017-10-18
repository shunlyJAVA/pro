<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<!--相当于response.setContentType("text/html; charset=UTF-8"); 通知浏览器以UTF-8进行中文解码   导入jar包-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<html>
<body>
<json:object>
    <json:array name="application" var="c">
        <json:object>
            <json:property name="id" value="${c.id}"/>
            <json:property name="name" value="${c.name}"/>
        </json:object>
    </json:array>
</json:object>
</body>
</html>