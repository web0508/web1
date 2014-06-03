package com.oaksly.sun.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oaksly.sun.dao.BaseDaoInterface;
import com.oaksly.sun.entity.DeveloperInfo;
import com.oaksly.sun.hibernate.HibernateSessionFactory;

public class BaseDaoInterfaceImpl implements BaseDaoInterface {

	@Override
	public int addDeveloper(DeveloperInfo developer) {
		// TODO Auto-generated method stub
		
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		try{
			session.save(developer);
		    transaction.commit();
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
		return 0;
	}

	@Override
	public int deleteDeveloper(DeveloperInfo developer) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		try{
			session.delete(developer);
		    transaction.commit();
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
		return 0;
	}

	@Override
	public int updateDeveloper(DeveloperInfo developer) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		try{
			session.update(developer);
		    transaction.commit();
		} catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
		return 0;
	}

	@Override
	public DeveloperInfo findOneDeveloper(int id) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hql = "from DeveloperInfo as tbl_developer where tbl_developer.id=:id";
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		List<DeveloperInfo> developers = query.list();
		HibernateSessionFactory.closeSession();
		if(developers.size()>0){
			return developers.get(0);
		} else {
			return null;
		}
	}

}
