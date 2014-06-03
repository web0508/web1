package com.oaksly.sun.dao;
/**
 * DeveloperDaoFactory. @author Weinbery @date 3-July-2014
 * 调用该类的静态方法，返回一个dao接口类型的dao实现类实例对象.
 */
import com.oaksly.sun.dao.impl.BaseDaoInterfaceImpl;

public class DeveloperDaoFactory {
	public static BaseDaoInterface getDeveloperDaoInstance() {
		return new BaseDaoInterfaceImpl();
	}

}
