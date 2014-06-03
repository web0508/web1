package com.oaksly.sun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * DeveloperInfo entity. @author Weinbery @date 3-July-2014
 */
@Entity
@Table(name = "tbl_developer", catalog = "hdm1100293_db")
public class DeveloperInfo implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Developer Properties
	 */
	private int id;
	private String name;
	private int age;
	private String gender;
	private String tel;
	private String city;
	private String email;
	private String password;
	
	
	/** default constructor */
	public DeveloperInfo() {
		super();
	}

	/** minimal constructor */
	public DeveloperInfo(Integer id) {
		this.id = id;
	}
    /**   full constructor */
	public DeveloperInfo(int id, String name, int age, String gender,
			String tel, String city, String email, String password) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tel = tel;
		this.city = city;
		this.email = email;
		this.password = password;
	}
	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Column(name = "gender", length = 10)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "tel", length = 20)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "city", length = 20)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "email", length = 40)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "password", length = 20)
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}