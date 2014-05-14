package com.xiangang.yu;

import com.opensymphony.xwork2.ActionSupport;

public class UserDataProcessAction extends ActionSupport {

    public int userId ;
    public String userName;
    public int userAge;
    public boolean userSex;
	private static final long serialVersionUID = -797465251041774086L;
	
	public String execute () throws Exception {
	
		if (true) {
			System.out.println("userId:"+userId+","+"userName:"+userName+","+"userAge:"+userAge+"userSex:"+userSex);
			return SUCCESS;
		} else {
		   return ERROR;	
		}
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getUserAge() {
		return userId;
	}
	
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	public boolean getUserSex() {
		return userSex;
	}
	
	public void setUserSex(boolean userSex) {
		this.userSex = userSex;
	}

}
