package com.mapping;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tables.Answer;
import com.tables.Question;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {

			System.out.println("Hello World!");

			Configuration conf = new Configuration();
			conf.configure();

			SessionFactory sesfac = conf.buildSessionFactory();

			Session ses = sesfac.openSession();

			Question obj1 = new Question();
			obj1.setQid(1);
			obj1.setQuestion("what is java");

			Answer ob1 = new Answer();
			ob1.setAid(1);
			ob1.setAns("java is oops laungauge");

			Answer ob2 = new Answer();
			ob1.setAid(2);
			ob1.setAns("java is platform independent");

			obj1.setAns(ob1);

			ses.save(obj1);
			ses.save(ob1);

			ses.beginTransaction();
			ses.getTransaction().commit();

			ses.close();

			System.out.println("Executed");
		} catch (Exception e) {
			System.out.println("exception" + e);
		}

	}
}
