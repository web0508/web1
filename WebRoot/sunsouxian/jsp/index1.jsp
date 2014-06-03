<%@ page language="java" import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%  String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<! DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN>
<html:html lang="true">
<head>
<html:base />
<title>欢迎使用人员管理系统</title>

</head>
<body>
<a href="list.do">查看用户列表</a><br></body>
</html:html>