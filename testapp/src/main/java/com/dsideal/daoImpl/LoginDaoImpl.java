package com.dsideal.daoImpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class LoginDaoImpl {
	public void login(){
		Configuration cf=new Configuration().configure();
		//SessionFactory sf = cf.configure().buildSessionFactory();
		SessionFactory sf = cf.buildSessionFactory(new StandardServiceRegistryBuilder().build()); //new StandardServiceRegistryBuilder().build()
		Session s = sf.openSession();
		String hql = "";
		Query q = s.createQuery(hql);
		int a = q.executeUpdate();
		s.close();
		System.out.println(a);
	}
}
