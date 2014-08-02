package com.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Before;
import org.junit.Test;

public class LoginDaoImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogin() {
		System.out.println("1");
		Configuration configuration = new Configuration().configure();
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	    SessionFactory sf= configuration.buildSessionFactory(serviceRegistry);
		Session s = sf.openSession();
		String hql = "from StudentDemo";
		Query q = s.createQuery(hql);
		
		System.out.println(q.list().size());
		s.close();
	}

}
