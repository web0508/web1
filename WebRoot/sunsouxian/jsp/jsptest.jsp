<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head><title>request lifetime</title></head>
<body>
<font color="red">request.jsp</font><br><br>
You are the <font color="blue">
<jsp:getProperty name="countr" property="counter" param="theCount"/>
</font>visiter!<br>
<%
out.println("it is a counter!");
%>
</body>
</html>