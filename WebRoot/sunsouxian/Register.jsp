<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center>
    <font size="4">
       <h2>Oaksly开发者注册</h2>
    <form action="DeveloperRegister.action" method="post">
    
    <table>
    <tr><td colspan="2"><s:actionmessage/></td></tr>
        <tr>
        <td>编号：</td><td><input type="text" name="id"/></td>
    </tr>
        <tr>
        <td>姓名：</td><td><input type="text" name="name"/></td>
    </tr>
        <tr>
        <td>密码：</td><td><input type="text" name="password"/></td>
    </tr>
        <tr>
        <td>确认密码：</td><td><input type="text" name="password"/></td>
    </tr>
        <tr>
        <td>年龄：</td><td><input type="text" name="age"/></td>
    </tr>
        <tr>
        <td>性别：</td><td><input type="text" name="gender"/></td>
    </tr>
        <tr>
        <td>电话：</td><td><input type="text" name="tel"/></td>
    </tr>    
    <tr>
        <td>城市：</td><td><input type="text" name="city"/></td>
    </tr>
        <tr>
        <td>E-Mail：</td><td><input type="text" name="email"/></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="注册"/>
            <input type="reset" value="重置"/>
        </td>
    </tr>
    </table>
    </form>
    </font>
    </center>
  </body>
</html>
