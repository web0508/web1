<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <%@page import="cmcc.gz.platform.core.utils.CommonUtils"%>
<%@page import="java.util.Date"%>
<%@ include file="/resources/page/cache.jsp" %> --%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%-- <%@ taglib tagdir="/WEB-INF/tags" prefix="tag" %> --%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

/* String project_main_header_image_url = cacheUtil.getSysParamVal("project_main_header_image_url", String.class, "resources/images/banner.png");
Integer project_main_header_image_height = cacheUtil.getSysParamVal("project_main_header_image_height", Integer.class, 64);
Integer project_main_header_image_width = cacheUtil.getSysParamVal("project_main_header_image_width", Integer.class, 600);
Integer project_main_header_font_size = cacheUtil.getSysParamVal("project_main_header_font_size", Integer.class, 32);
Integer chrome_height = (CommonUtils.isIE(request)) ? 0 : 2; */
%>    
<html>
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>基础开发平台</title>
		
		<link rel="shortcut icon" href="resources/images/favicon.ico" type="image/x-icon"/>
		<link rel=Bookmark href="resources/images/favicon.ico"/>
		
		<%@ include file="/resources/page/jeasyui-resources.jsp"%>
		<link rel="stylesheet" type="text/css" href="resources/css/mainui.css">
		<script type="text/javascript" src="resources/js/mainui.js"></script>
	</head>
	<body class="easyui-layout">
		<div data-options="region:'north',border:false" style="height:64px;padding-top:0px;">
			<table border="0" width="100%" style="padding:0px;" cellspacing='0' cellpadding='0'>
				<tr style="background:url(resources/images/banner-bg.png) repeat-x;">
					<td width="600px">
						<div style="height:64px;background-image:url('');background-repeat:no-repeat;">
							<div style="float:left;display:inline;height:32px;width:60%;margin:10px 0px 0px 20px;">
								<span style="font-family:宋体;font-size:32px;color:white;font-weight:bold;">基础开发平台</span>
							</div>
						</div>
					</td>
					<td valign="top">
						<div id="global_nav" class="i-portal-header-nav">
				        	<ul>
		                    	<li><a href="javascript:void(0)" class="i-portal-header-nav-welcome">&nbsp;${http_session_atribute_current_user_info.empname}(${http_session_atribute_current_user_info.orgname})</a></li>
		                    	<li><a href="javascript:doEditUserInfo();" class="i-portal-header-nav-cfg">设置</a></li>
		                    	<li><a href="javascript:doLogout();" class="i-portal-header-nav-logout">注销</a></li>
				        	</ul>
				    	</div>
					</td>
				</tr>
			</table>
		</div>
		<div data-options="region:'west',split:true,iconCls:'icon-navigation'" title="系统导航" style="width:210px;padding1:1px;overflow:hidden;">
			<div class="easyui-accordion" data-options="fit:true,border:false">
				<!-- <tag:access-menus/> -->
		<%@ include file="/includefiles/access-menus.jsp"%>  
			
			</div>
		</div>
		<div data-options="region:'center'" style="overflow:hidden;">
			<div id="main" class="easyui-tabs" data-options="fit:true,border:false">
				<div title="主页" data-options="iconCls:'icon-home',border:false" style="padding:20px;overflow:hidden;"> 
					<div style="margin-top:20px;">
						<h3>开发说明</h3>
						<ul>
							<li></li> 
							<li></li> 
							<li></li> 
						</ul>
					</div>
				</div>
		
				
			</div>
		</div>
		<div id="userInfoDialog" style="display:none;">
		</div>
	</body>
</html>