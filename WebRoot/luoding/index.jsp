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
 
  </head>
  <body class="easyui-layout">
   <link href="resources/common.css" rel="stylesheet" type="text/css" />
    <link href="luoding/main.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="luoding/main.js" charset="utf-8"></script>
  		<div data-options="region:'north',border:false"  style="height:41px; onverflow:hidden;">
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
	<div id="addnewwin"  class="easyui-dialog openwindow" closed="true" title="新增人员"  style="width:500px;height:210px;	position:relative;overflow:hidden;"  >
		<form  action="dataactionld.action"  method="POST">
		<div id="formcontainer">
				<ul class="formul">
					<li><span class="lispan">姓名:</span>   <input class="openinputtext" type="text"  id="" name="username"></input></li>
					<li>
						<span class="lispan">性别:</span>  
						<input type="radio" name="usersex" value="男" checked="checked" />男
						<input type="radio" name="usersex" value="女" />女</li>
					<li><span class="lispan">电话号码:</span>  <input class="openinputtext" type="text"  id="userphone" name="userphone"></input></li>
				</ul>
			<div class="btmtoolbar">
				<input type="button" value="取消" class="btn btn-primary toolbtn" onclick="javascript: $('#addnewwin').dialog('close');">
				<input type="submit" value="确定" class="btn btn-primary toolbtn" >
			</div> 
		</div>	
		</form>
		
	</div>
  </body>
</html>
