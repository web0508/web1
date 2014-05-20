package com.action;  

import com.opensymphony.xwork2.ActionSupport;  

public class dataactionld extends ActionSupport {  
	/**
	 * 
	 */
	 private static final long serialVersionUID = 1L;
	 private String username;  
	 private String usersex;  
	 private String userphone;
	 private String reMsg; //返回消息 在登录成功或者失败页面显示；  
	 private String account_password2;
	 private String account_name;
	 public String getAccount_name() {
		 return account_name;
	 }
	 public void setAccount_name(String account_name) {
		 this.account_name = account_name;
	 }
	 public String getAccount_password2() {
		 return account_password2;
	 }
	 public void setAccount_password2(String account_password2) {
		 this.account_password2 = account_password2;
	 }
	 public String getUsername() {
		 return username;
	 }
	 public void setUsername(String username) {
		 this.username = username;
		 System.out.print(username);
	 }
	 public String getUsersex() {
		 return usersex;
	 }
	 public void setUsersex(String usersex) {
		 this.usersex = usersex;
	 }
	 public String getUserphone() {
		 return userphone;
	 }
	 public void setUserphone(String userphone) {
		 this.userphone = userphone;
	 }
	 public String getReMsg() {
		 return reMsg;
	 }
	 public void setReMsg(String reMsg) {
		 this.reMsg = reMsg;
	 }

	 public String execute() throws Exception{
		 if("123456".equals(account_password2) && "85151303986".equals(account_name)){
			 return SUCCESS;  
		 } else {
			 return ERROR;
		 }
	 }
}  