package com.oaksly.sun.service;

import com.oaksly.sun.entity.DeveloperInfo;

public interface DeveloperService {
	public boolean DeveloperRegist(DeveloperInfo developer);
	public boolean DeveloperLogin(DeveloperInfo developer);
	public int DeveloperDelete(DeveloperInfo developer);
	public int DeveloperUpdate(DeveloperInfo developer);
	public DeveloperInfo DeveloperQuery(int id);

}
