package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Before;
import org.junit.Test;

import com.dsideal.entity.ClassDemo;
import com.dsideal.entity.StudentDemo;
import com.dsideal.tools.GetSessionFactory;

public class LoginDaoImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogin() {
		/*System.out.println("1");
		Configuration configuration = new Configuration().configure();
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	    SessionFactory sf= configuration.buildSessionFactory(serviceRegistry);
		Session s = sf.getCurrentSession();*/
		
		//级联查询
		/*Transaction ts = s.beginTransaction();
		String hql = "from ClassDemo cd where cd.classId = 1";
		
		Query q = s.createQuery(hql);
		
		List<ClassDemo> qlist = new ArrayList<ClassDemo>();
		ClassDemo cd = new ClassDemo();
		qlist = q.list();
		if(qlist.size()>0){
			cd = qlist.get(0);
		}
		List<StudentDemo> sdlist = new ArrayList<StudentDemo>();
		sdlist=cd.getStudentList();
		
		for (StudentDemo studentDemo : sdlist) {
			System.out.println(studentDemo.getName());
		}
		*/
		//级联保存
		/*
		Session s = GetSessionFactory.getSession();
		
		Transaction ts = s.beginTransaction();
		
		ClassDemo cd = new ClassDemo();
		cd.setName("6ban");
		
		StudentDemo sd = new StudentDemo();
		sd.setCd(cd);
		sd.setAge(20);
		sd.setName("小6");
		sd.setPassword("123456");
		
		s.save(sd);
		ts.commit();
		*/
		//级联删除   ****
		Session s = GetSessionFactory.getSession();
		
		Transaction ts = s.beginTransaction();
		/*String hql = "from StudentDemo cd where cd.stuId = '8a8a88e347a033d30147a033d4af0000'";
		
		Query q = s.createQuery(hql);
		
		List<StudentDemo> qlist = new ArrayList<StudentDemo>();
		StudentDemo sd = new StudentDemo();
		qlist = q.list();
		if(qlist.size()>0){
			sd = qlist.get(0);
		}
		s.delete(sd);*/
		String hql = "from ClassDemo cd where cd.classId = 1";
		
		Query q = s.createQuery(hql);
		
		List<ClassDemo> qlist = new ArrayList<ClassDemo>();
		ClassDemo cd = new ClassDemo();
		qlist = q.list();
		if(qlist.size()>0){
			cd = qlist.get(0);
		}
		s.delete(cd);
		ts.commit();
	}
	
}
