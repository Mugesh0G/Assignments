package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Classes.Details;
import com.Classes.Qualify;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
        con.registerShutdownHook();
        Details dobj = con.getBean(Details.class,"studentDetails");
        System.out.println(dobj.getId()+"\n"+dobj.getName()+"\n"+dobj.getMobNo()+"\n"+dobj.getAddress()+"\n"+dobj.getHobby());
//        Qualify qobj = con.getBean(Qualify.class,"qualify");
//        System.out.println(qobj);
     
        
    }
}

























