package com.hibernate.app01.Dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.app01.Dao.ProductDao;
import com.hibernate.app01.entity.ProductEntity;
import com.hibernate.app01.utils.HibernateUtils;

public class ProductDaoImpl implements ProductDao {

	@Override
	public Integer saveProductEnttity(ProductEntity entity) {
		SessionFactory sessionFactory = HibernateUtils.createSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Integer id=(Integer) session.save(entity);
		return null;
	}

}
