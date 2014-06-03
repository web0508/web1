package com.oaksly.sun.action;

import com.oaksly.sun.entity.DeveloperInfo;
import com.oaksly.sun.service.DeveloperService;
import com.oaksly.sun.service.DeveloperServiceFactory;
import com.opensymphony.xwork2.ActionSupport;

public class DeveloperRegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int age;
	private String gender;
	private String tel;
	private String city;
	private String email;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() throws Exception {
		DeveloperInfo developer = new DeveloperInfo();
		developer.setId(id);
		developer.setName(name);
		developer.setAge(age);
		developer.setGender(gender);
		developer.setTel(tel);
		developer.setCity(city);
		developer.setEmail(email);
		developer.setPassword(password);
		DeveloperService developerService = DeveloperServiceFactory.getDeveloperServiceInstance();
		if(developerService.DeveloperRegist(developer)) {
			this.addActionMessage("恭喜您，注册成功！");
			return SUCCESS;
		}
		else {
			this.addActionMessage("对不起，注册失败！");
			return INPUT;
		}
	}

}
