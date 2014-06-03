package com.oaksly.sun.service.impl;

import com.oaksly.sun.dao.BaseDaoInterface;
import com.oaksly.sun.dao.DeveloperDaoFactory;
import com.oaksly.sun.entity.DeveloperInfo;
import com.oaksly.sun.service.DeveloperService;

public class DeveloperServiceImpl implements DeveloperService {
	
	private BaseDaoInterface dev = DeveloperDaoFactory.getDeveloperDaoInstance();

	public boolean DeveloperRegist(DeveloperInfo developer) {
		// TODO Auto-generated method stub
		DeveloperInfo oldDeveloper = dev.findOneDeveloper(developer.getId());
		if(oldDeveloper != null) {
			return false;//该开发者已经存在,不能再次注册.
		} 
		else {
			dev.addDeveloper(developer);
			return true;
		}
		
	}

	public boolean DeveloperLogin(DeveloperInfo developer) {
		// TODO Auto-generated method stub
		DeveloperInfo oldDeveloper = dev.findOneDeveloper(developer.getId());
		if(oldDeveloper != null) {
			return false;//该开发者已经存在,不能再次注册.
		} 
		else {
			dev.addDeveloper(developer);
			return true;
		}

	}

	@Override
	public int DeveloperDelete(DeveloperInfo developer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DeveloperUpdate(DeveloperInfo developer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DeveloperInfo DeveloperQuery(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
