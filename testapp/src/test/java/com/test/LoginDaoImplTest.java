package com.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Before;
import org.junit.Test;

import com.dsideal.entity.StudentDemo;

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
		Session s = sf.getCurrentSession();
		Transaction ts = s.beginTransaction();
		String hql = "from StudentDemo";
		StudentDemo sd = new StudentDemo();
		sd.setName("zhangsan");
		sd.setPassword("123456");
		sd.setAge(20);
		s.save(sd);
		Query q = s.createQuery(hql);
		System.out.println(q.list().size());
		ts.commit();
	}

}
