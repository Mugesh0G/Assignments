package com.OneToMany;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entity.Bikes;
import com.Entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try{
    		
    	
        System.out.println( "Hello World!" );
        
        Configuration conf = new Configuration();
        conf.configure();
        
        SessionFactory sesf = conf.buildSessionFactory();
        
        Session ses = sesf.openSession();
        
        User user1 = new User();
        user1.setUseriId(20);
        user1.setUsername("sebastian");
        
        User user2 = new User();
        user2.setUseriId(25);
        user2.setUsername("murugan");
        
        Bikes bike1 = new Bikes();
        bike1.setBikeId(145);
        bike1.setBikeName("himalaiyan");
        bike1.setReleaseYear(2021);
        
        Bikes bike2 = new Bikes();
        bike2.setBikeId(234);
        bike2.setBikeName("BMW GS");
        bike2.setReleaseYear(2021);
        
       
        
        List<Bikes>bList=new LinkedList<Bikes>();
        bList.add(bike1);
        bList.add(bike2);
        
        user1.setBike(bList);
      
        
       
        
        
       
        ses.save(user1);
        ses.save(user2);
        ses.save(bike1);
        ses.save(bike2);
        ses.beginTransaction();
        ses.getTransaction().commit();
        
        ses.clear();
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
        
        
        
        
        
        
    }
}
