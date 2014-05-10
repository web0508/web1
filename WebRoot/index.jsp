<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>人员管理系统</title>
    <meta charset="utf-8"/>
    <%@ include file="resources/page/jeasyui-resources.jsp"%>
    <link href="resources/css/main.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="resources/js/main.js" charset="utf-8"></script>
  </head>
  <body class="easyui-layout">
	  <div region="center"  style="background:#eee;" title='人员管理系统demo开发入口'> 
	  			<p id="desc">问了避免代码冲突，我以各位的名字建立了三个文件夹，该文件在目录webroot/yourname/</br>请务必在该文件夹下建立各自的css,js,html文件进行开发，新建的文件的命名规则为yourname_filename.css/html/js(比如:luoding_main.css)。<br/>所有新建的文件务必放到以各位名字命名的文件夹下（比如：webroot/yuxianang/）。
	  				请点击各自的名字 进入自己的开发</p>
	  				
	  			<h1 id="h1title">请点击各自的名字 进入自己的开发</h1>	
	 					<a class="easyui-linkbutton barbtn"  href="http://localhost:8080/damo1/luoding/index.jsp">罗鼎</a>
						<a href="http://localhost:8080/damo1/yuxiangang/index.jsp" class="easyui-linkbutton barbtn" >于先刚</a>
						<a href="http://localhost:8080/damo1/sunsouxian/index.jsp" class="easyui-linkbutton barbtn" >孙守贤</a>
	  
	  </div>  

  </body>
</html>
