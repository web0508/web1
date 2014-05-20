<!DOCTYPE html><%@ page language="java" pageEncoding="UTF-8"%>
<%String path = request.getContextPath();
String basePath = request.getScheme()+"://"
+request.getServerName()+":"+request.getServerPort()+path+"/";
String login_window_width = "900px";
String login_window_height = "349px";
String input_window_top_margin_height = "5px";
String login_window_bgimage = "login_bg.png";
String icoPath = basePath + "resources/images/favicon.ico";
boolean enableLoginCode = false;	
%>
<html>
	<head>
		<base href="<%=basePath%>">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>基础开发平台</title>
		<%@ include file="/resources/page/jeasyui-resources.jsp"%>
		<link href="resources/css/login.css" rel="stylesheet"/>
		<script charset="utf-8" src="resources/js/md5.js"></script>
		<script type="text/javascript">
			
		
			$(document).ready(function(){
			
		
				
				
			/* 	$("#btnGetSmsCode1").click(function(){
					codetimer.timer = clearInterval(codetimer.timer);
				}); */
				
			});
			
			function validateForm() {
			this.submit();
			}
		</script>
<style type="text/css">
﻿﻿
</style>
</head>
<body>
<div id="container">
  <div class="wrapper" style="height:58px;">
<!--   	<img src="resources/images/loginlogo.jpg" style="float:left;margin-top:5px;margin-left:20px;"/> -->
  </div>

    

  <div class="main-wrap" id="bgRepeat-x" style="background:no-repeat url('resources/images/centerbg.jpg');">
    <div class="index-bg-repeat">
	    <div id="main">
		    <div id="left">
		
		    </div>
		
		    <div id="right">
		
		      <div id="login-frm-div" class="login-frm"> 
		 		 <form action="userManager.action" method="post" onsubmit="validateForm();">
					<div class="login-main">
						<h3>用户登录</h3>
								<p class="id" style="position:relative; margin-top:15px;margin-left:12px;">
						     	<label style="margin-top:15px;width:65px;" class="text" id="_label_txtUserName" for="txtUserName">账&nbsp;&nbsp;&nbsp;户：</label>
              					<input class="text" id="account_name" class="input" name="account_name" value="85151303986"  tabindex="1" maxlength="20" style="border-radius: 3px; background: none repeat scroll 0% 0% rgb(245, 248, 250); font-weight: normal; position: relative;"  type="text">
								</p>
								
								<p class="id" style="position:relative; margin-top:15px;margin-left:12px;">
						     	<label style="margin-top:15px;width:65px;" class="text"  for="txtUserName">密&nbsp;&nbsp;&nbsp;码：</label>
              					<input class="text"  name="account_password2" value="123456" tabindex="1" maxlength="20" style="border-radius: 3px; background: none repeat scroll 0% 0% rgb(245, 248, 250); font-weight: normal; position: relative;"  type="password">
								<input class="input" type="hidden" name="account_password" value=""/>
								<input class="input" type="hidden" name="index" value="0"/>
								</p>
							<%if(enableLoginCode) { %> 
								<p class="id" style="position:relative; margin-top:15px;margin-left:12px;">
						     	<label style="margin-top:15px;" class="text"  for="txtUserName">验证码：</label>
              					<input class="text" name="randomcode"  tabindex="1" maxlength="20" style="width:80px;border-radius: 3px; background: none repeat scroll 0% 0% rgb(245, 248, 250); font-weight: normal; position: relative;"  type="text">
								<img onclick="reloadRandomCode()" alt="点击更换" id="rcode" src="randomcode" style="position:absolute;right:33px;top:5px;height:35px;">
								
								</p>
							<%}else{ %>
									<p class="id" style="position:relative; margin-top:15px;margin-left:12px;">
              					<input name="randomcode" type="hidden">
								</p>
							<%} %> 


								   <p class="ft" id="loginBtnBg" style="margin-top:15px;margin-left:70px;">
						
						              <input id="loginBtn"  tabindex="4" class="hover log-btn-valentin"  value="登 录" type="submit">
										<span id="forgetpw">忘记密码</span>
						            </p>
						            
						            <p class="id" id="msg" style="color: red;font-size: 12px;position:relative;margin-left:12px;">
			        			&nbsp;&nbsp;<%=null == request.getAttribute("errorMsg") ? "" : request.getAttribute("errorMsg") %>
			        		</p>
					</div>
		 		 </form>
		      </div>
		
		    </div>
	
		</div>
	</div>
  </div>  

  

  <div class="index-tab-wrap">

      <ul id="menuTag">


      </ul>



     <div class="function clear" id="function" style="display:block">



        <div class="function-inner right-dot w430" >
			<div class="f10 fCon" style="display:block;cursor:pointer;" id="download139url">
          	<h3><strong>浏览器（推荐）：</strong> <p>IE8.0及以上浏览器(推荐360极速浏览器)</p></h3>
        	</div>


        </div>

        <div class="function-inner" id="randshow">
          <div class="f2 fCon" style="display: block;"> <i></i>
          <h3><strong>分辨率（推荐）：</strong> <p style="padding-left:100px;">1024*768及以上分辨率</p></h3>
         
        	</div>
        </div>
		
	
      </div>

     

  </div>



   <div class="copyright-border"> 
   	<div class="wrapper">
   		<div id="copyright" style="relative">
   				


  </div></div></div>

</div>
<!-- 修改密码弹出框-->
<div id="updatepw" class="easyui-dialog" title="忘记密码" closed="true" data-options="modal:true,cache:false"  style="width:480px;height:450px;padding:10px;overflow:hidden;">
	<div id="container">
    	<div class="step_til">
			通过手机号设置新密码
			<span style="display:block;">验证您的手机号码，支持移动、联通、电信 </span>
		</div>
		<form id="setPwdInfo" method="post">
	    <ul style="padding-top:20px;" id="formlist">
	    	<li >
				<span class="left">手机号码：</span>
				<div>
				<input class="text clearinput" name="account_name" id="account_name1"   tabindex="1" maxlength="20"   type="text">
				</div>
				<span id="msg1" class="right"></span>
			</li>
	  	  <li  >
				<span class="left">验证码：</span>
				<div>
					<input class="text clearinput"  name="randomcode" id="randomcode1"  tabindex="1" maxlength="20"  type="text">
				</div>
				<span id="msg2" class="right"></span>
			</li>
	 		<li >
				<span class="left">&nbsp;&nbsp;</span>
				<div>
					<img onclick="reloadSmsCode()" width="70" height="21" id="vcode" class="rcode" src="smscode"/>
					<a id="changeimg" href="javascript:reloadSmsCode()" class="changimg">看不清?换一张</a>
				</div>
			</li>
			<li >
				<span class="left">短信验证码：</span>
				<div>
					<input class="text clearinput"  name="verify_code" id="verify_code" tabindex="1" maxlength="20"   type="text">
				</div>
				<span  class="right">
				<a id="btnGetSmsCode" class="lit_gbtn ml_10"  href="javascript:;">获取短信验证码</a>
				<a id="btnGetSmsCode1" class="lit_gbtn_unable ml_10" style="display:none;"  href="javascript:;"><span id="timerwarn">验证码已发送(<span id="timer">60</span>)</span></a>
				</span>
				
			</li>
	     	<li >
				<span class="left">设置密码：</span>
				<div>
					<input class="text clearinput"  name="account_password" id="account_password" tabindex="1" maxlength="20"   type="password">
				</div>
				<span id="msg3" class="right"></span>
			</li>
	 		<li >
				<span class="left">确定密码：</span>
				<div>
					<input class="text clearinput"  id="newpasswordtoo" validType="twopassword['account_password']" tabindex="1" maxlength="20" style="border-radius: 3px; background: none repeat scroll 0% 0% rgb(245, 248, 250); font-weight: normal; position: relative;"  type="password">
				</div>
				<span id="msg4" class="right" ></span>
			</li>
	   		 <li >
	   		 	<div style="width:90px;height:30px;float:left;"></div>
			  <input    tabindex="4" class="hoverpointer log-btn-valentin forgetbtn" onclick="javascript:updatePwd();"  value="确定" type="button" />
				<input   tabindex="4" class="hoverpointer log-btn-valentin forgetbtn" onclick="javascript:$('#updatepw').dialog('close')"  value="取消" type="button" />
			</li>
	  
	    </ul>
	    </form>
    </div>
</div>
</body></html>