package com.bridgeit.HibernateUtility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bridgeit.pojo.User;

public class HibernateUtil {
	

static SessionFactory sessionFactory= null;
public static SessionFactory getSessionFactory() 
{
	Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
	return sessionFactory=configuration.buildSessionFactory();
	
}
}
