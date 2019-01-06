package com.lab9.hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
	
    	Configuration cg = new Configuration().configure().addAnnotatedClass(feeslip.class);
    	SessionFactory fac = cg.buildSessionFactory();
    	Session sess = fac.openSession();
    	
    	Scanner input = new Scanner(System.in);
    	int choice;
    	System.out.println("Enter choice \n\t1 --> Create Entry \n\t2 --> Show Entry \n\t3 --> Update Entry \n\t4 --> Delete Entry");
    	choice = input.nextInt();
    	
    	if(choice == 1) {
    		feeslip feeslip0 = new feeslip();
        	feeslip0.setfname("Muneeb");
        	feeslip0.setsname("Ishaq");
        	feeslip0.setregnumber(173362);
        	feeslip0.setpass("445");
        	feeslip0.setfeemonth("grt");
        	feeslip0.setcurrentdate("2118/05/05");
        	Transaction t = sess.beginTransaction();
        	sess.save(feeslip0);
        	t.commit();
    	} else if(choice == 2) {
    		int regnumber = 173362;
            feeslip feeslip1= sess.get(feeslip.class, regnumber);         
            System.out.println("First Name: " + feeslip1.getfname());
            System.out.println("Last Name: " + feeslip1.getsname());
            System.out.println("Password: " + feeslip1.getpass());
            System.out.println("Fee Month: " + feeslip1.getfeemonth());
            System.out.println("Current Date: " + feeslip1.getcurrentdate());
    	} else if(choice == 3) {
    		feeslip feeslip2 = new feeslip();
            feeslip2.setregnumber(173362);
            feeslip2.setfname("Muneeb");
            feeslip2.setsname("Saddal");
            feeslip2.setcurrentdate("2018/05/28");
            feeslip2.setfeemonth("may");
            feeslip2.setpass("1234");
            Transaction t = sess.beginTransaction();
            sess.update(feeslip2);
            t.commit();
    	} else if(choice == 4) {
    		feeslip feeslip3 = new feeslip();
    	    feeslip3.setregnumber(173362);
    	    Transaction t = sess.beginTransaction();
    	    sess.delete(feeslip3);
    	    t.commit();
    	}
    	
    	sess.close();
    	fac.close();
    }
}