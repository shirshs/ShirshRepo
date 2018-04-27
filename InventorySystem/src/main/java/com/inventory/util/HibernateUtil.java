package com.inventory.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {


public static SessionFactory buildSessionFactory() {
System.out.println("inside sessionfactory");
SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
System.out.println("Hibernate SESSION FACTORY CREATED");
return sessionFactory;
}

}
