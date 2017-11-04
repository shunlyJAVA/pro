<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<head>
    <meta charset="utf-8">
    <title>无标题文档</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" charset="UTF-8">
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="t10/jquery/2.1.4/jquery.min.js"></script>
    <script src="t10/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <link href="t11/t11.css" rel="stylesheet" type="text/css">
    <link href="t11/base.css" rel="stylesheet" type="text/css">
</head>
<body>
<tiles:insertAttribute name="head" />
<tiles:insertAttribute name="body" />
<tiles:insertAttribute name="bottom" />
</body>
