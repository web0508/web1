package com.xiangang.yu;

import com.opensymphony.xwork2.ActionSupport;

public class UserDataProcessAction extends ActionSupport {

    public int userId ;
    public String userName;
    public int userAge;
    public boolean userSex;
    
    private MessageData data; 
	private static final long serialVersionUID = -797465251041774086L;
	
	public String execute () throws Exception {
	
		if (true) {
			System.out.println("userId:"+userId+","+"userName:"+userName+","+"userAge:"+userAge+"userSex:"+userSex);
			//do some business logic (算法，数据库，文件一些处理)
			// Data data = gdsfjkfdsaf;
			// data = fdsadf;
			data = new MessageData();
			data.setAge(19);
			data.setUserName("xiaoao");
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
	
	public void setData (MessageData data)
	{
		this.data = data;
	}
	
	public MessageData getData()
	{
		return this.data;
	}

}
