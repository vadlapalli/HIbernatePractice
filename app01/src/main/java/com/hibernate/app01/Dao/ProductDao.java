package com.hibernate.app01.Dao;

import com.hibernate.app01.entity.ProductEntity;

public interface ProductDao {
	
	Integer saveProductEnttity(ProductEntity entity);
	
	ProductEntity fetchProductEntity(Integer id);
	
	String updateProductPriceNUnitsInStock(Integer id, Double unitPrice, Integer unitsInStock);
	
	String deleteProduct(Integer id);

}
