package com.hibernate.app01;

import com.hibernate.app01.Dao.ProductDao;
import com.hibernate.app01.Dao.Impl.ProductDaoImpl;
import com.hibernate.app01.entity.ProductEntity;

public class Main {
    public static void main( String[] args ) {
    	
    	ProductEntity entity= new ProductEntity();
    	entity.setName("Java Book");
    	entity.setAvailable(Boolean.TRUE);
    	entity.setDescription("For Learn");
    	entity.setUnitPrice(450.0);
    	entity.setUnitsInStock(10);
    	
    	ProductDao dao=new ProductDaoImpl();
    	Integer id = dao.saveProductEnttity(entity);
    	System.out.println("Product saved:"+id);
       
    }
}