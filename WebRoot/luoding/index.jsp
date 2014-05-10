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
    <title>人员管理系统--罗鼎 </title>
    <meta charset="utf-8"/>
    <%@ include file="../resources/page/jeasyui-resources.jsp"%>
    <link href="luoding/main.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="luoding/main.js" charset="utf-8"></script>
  </head>
  <body class="easyui-layout">
  		<div data-options="region:'north',border:false" title="人员管理系统--罗鼎" style="height:60px;">
	  				<div id="toolbar">
					<input class="easyui-searchbox barbtn" data-options="prompt:'Please Input Value',menu:'#mm',
			searcher:function(value,name){alert(value+':'+name)}" style="width:150px" ></input>
						<a class="easyui-linkbutton barbtn" href="javascript:addpeople();">新增</a>
						<a href="javascript:updatepeople();" class="easyui-linkbutton barbtn" >修改</a>
						<a href="javascript:deletepeople();" class="easyui-linkbutton barbtn" >删除</a>
	  				</div>
		</div>
	  <div region="center"  style="background:#eee;">
	 	<table id="tt"></table>  
	  
	  </div>  

  </body>
</html>
