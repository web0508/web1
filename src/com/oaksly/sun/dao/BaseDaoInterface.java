package com.oaksly.sun.dao;

import com.oaksly.sun.entity.DeveloperInfo;
/**
 * 
 */
public interface BaseDaoInterface {
	/**
	 * @param entity
	 */
	public int addDeveloper(DeveloperInfo developer);
	/**
	 * @param entity
	 */
	public int deleteDeveloper(DeveloperInfo developer);
	/**
	 *@param entity
	 */
	public int updateDeveloper(DeveloperInfo developer);
	
	public DeveloperInfo findOneDeveloper(int id);
}