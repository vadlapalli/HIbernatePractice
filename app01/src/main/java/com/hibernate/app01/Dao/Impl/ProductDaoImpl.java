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
		transaction.commit();
		session.close();
		return id;
	}

	@Override
	public ProductEntity fetchProductEntity(Integer id) {
		SessionFactory sessionFactory = HibernateUtils.createSessionFactory();
		Session session = sessionFactory.openSession();
		// load()/get() method can be used to fetch the data from the DB
		//ProductEntity entity = session.load(ProductEntity.class, id);
		
		ProductEntity entity = session.get(ProductEntity.class, id);
		session.close();
		return entity;
	}

	@Override
	public String updateProductPriceNUnitsInStock(Integer id, Double unitPrice, Integer unitsInStock) {
		SessionFactory sessionFactory = HibernateUtils.createSessionFactory();
		Session session = sessionFactory.openSession();
		String msg="";
		ProductEntity entity = session.get(ProductEntity.class, id);
		if(entity !=null) {
			Transaction t=session.beginTransaction();
			entity.setUnitPrice(unitPrice);
			entity.setUnitsInStock(unitsInStock);
			t.commit();
			msg="Product Updated SuccessFully"+id;
		}else {
			msg=id+":Doesn't Existed";
		}
		session.close();
		return msg;
	}

	@Override
	public String deleteProduct(Integer id) {
		SessionFactory sessionFactory = HibernateUtils.createSessionFactory();
		Session session = sessionFactory.openSession();
		String msg="";
		ProductEntity entity = session.get(ProductEntity.class, id);
		if(entity !=null) {
			Transaction t=session.beginTransaction();
			session.delete(entity);
			t.commit();
			msg="Product deleted SuccessFully";
		}else {
			msg=id+":Doesn't Existed";
		}
		session.close();
		return msg;
	}

}
