package com.scp.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    Address ads=new Address(1,"pune",123456);
    Student std=new Student(1,"sandesh",ads);
    Configuration cnfg=new Configuration();
    cnfg.configure();
    SessionFactory sf=cnfg.buildSessionFactory();
    Session session=sf.openSession();
    Transaction transaction=session.beginTransaction();
    
    session.save(ads);
    std.setAd(ads);
    session.save(std);
    transaction.commit();
    session.close();
    
    
    
    
    
    
    }
}
