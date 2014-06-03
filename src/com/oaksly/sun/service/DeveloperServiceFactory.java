package com.oaksly.sun.service;

import com.oaksly.sun.service.impl.DeveloperServiceImpl;

public class DeveloperServiceFactory {
	
	public static DeveloperService getDeveloperServiceInstance() {
		
		return new DeveloperServiceImpl();
		
	}

}
