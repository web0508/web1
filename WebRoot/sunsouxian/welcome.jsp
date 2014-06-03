<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>welcome</title>
  </head>
 
  <body>
  <center>
<h2>恭喜您成为Oaksly的一员！</h2>
</center>
  </body>
</html>
