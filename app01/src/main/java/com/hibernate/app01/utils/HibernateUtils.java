package com.hibernate.app01.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {

	private static SessionFactory sessionFactory;

	private HibernateUtils() {
	}

	public static SessionFactory createSessionFactory() {
		if (sessionFactory == null) {
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
					.build();

			// Build the Metadata and SessionFactory
			Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

			sessionFactory = metadata.getSessionFactoryBuilder().build();
		}
		return sessionFactory;
	}
	
	public static void closeSessionFactory() {
		if(sessionFactory !=null) {
			sessionFactory.close();
		}
	}

}
