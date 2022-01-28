package com.hibernate;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.Entity.DetailsEntity;

/**
 * Hello world!
 *
 */
@SuppressWarnings("deprecation")
public class App {
	public static void main(String[] args) {

		try {
			System.out.println("Hello World!");

			Configuration conf = new Configuration();
			conf.configure("hibernate.cfg.xml").addAnnotatedClass(com.Entity.DetailsEntity.class);

			SessionFactory fact = conf.buildSessionFactory();

			Session ses = fact.openSession();
//			
//			
//
//			 DetailsEntity obj = new DetailsEntity();
//			 obj.setIdNo(1);
//			 obj.setName("subu");
//			 obj.setEmail("ezak_E@yahoo.com");
//			
//			 DetailsEntity obj2 = new DetailsEntity();
//			
//			 obj2.setIdNo(2);
//			 obj2.setName("mugesh");
//			 obj2.setEmail("mugesh_g@yahoo.com");
//			
//			 DetailsEntity obj3 = new DetailsEntity();
//			 obj3.setIdNo(3);
//			 obj3.setName("sithin");
//			 obj3.setEmail("sidharth_c@yahoo.com");
//			
//			 ses.save(obj);
//			 ses.save(obj2);
//			 ses.save(obj3);
//			 
			 Object s = ses.get(DetailsEntity.class, 1);
			 System.out.println(s);

			// String command = "Select e.Name from DetailsEntity e where idNo =
			// 2";
			//
			// Query qobj = ses.createQuery(command);
			// List<DetailsEntity>lobj = qobj.list();
			//
			//
			// for(Object obj : lobj)
			// {
			// System.out.println(obj);
			// }
			//
			// Scanner sc = new Scanner(System.in);
			// System.out.println("enter your id no to fetch");
			// int id = sc.nextInt();
			//
			// String hql = "Select e.Name from DetailsEntity e where idNo =
			// :id";
			// Query qobj = ses.createQuery(hql);
			// qobj.setParameter("id", id);
			// List<DetailsEntity>lobj = qobj.list();
			//
			//
			// for(Object obj : lobj)
			// {
			// System.out.println(obj);
			// }

			// Transaction trans = ses.beginTransaction();
			//
			// Scanner sc = new Scanner(System.in);
			// System.out.println("enter your id no to fetch");
			// int ide = sc.nextInt();
			// System.out.println("enter name to save");
			// String names = sc.next();
			// sc.close();
			//
			// String hql = "update DetailsEntity set Name=:nam where idNo =
			// :id";
			// Query qobj = ses.createQuery(hql);
			// qobj.setParameter("id", ide);
			// qobj.setParameter("nam", names);
			// int status= qobj.executeUpdate();
			//
			//
			// trans.commit();
			
			//Criteria cr = ses.createCriteria(DetailsEntity.class);
			//cr.add(Restrictions.gt("idNo", 1));
			//cr.addOrder(Order.desc("id"));
//			cr.setProjection(Projections.max("Name"));
//			List <DetailsEntity>lobj = cr.list();
//			 for(Object obj : lobj)
//						{
//					 System.out.println(obj);
//						}

			 Transaction trans = ses.beginTransaction();
			 trans.commit();

			System.out.println("completed");
			ses.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
