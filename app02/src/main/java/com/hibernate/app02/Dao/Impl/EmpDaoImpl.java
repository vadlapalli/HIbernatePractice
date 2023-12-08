package com.hibernate.app02.Dao.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.app02.Dao.EmpDao;
import com.hibernate.app02.entity.EmployeeEntity;

public class EmpDaoImpl implements EmpDao {
	
	EntityManagerFactory emf;
	
	public EmpDaoImpl() {
		emf=Persistence.createEntityManagerFactory("test");
	}

	@Override
	public EmployeeEntity saveEmp(EmployeeEntity entity) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		try {
			em.persist(entity);
			et.commit();
		}catch (Exception e) {
			et.rollback();
		}
		em.clear();
		return entity;
	}

	@Override
	public List<EmployeeEntity> findEmployeesByDeptNo(Integer deptNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> findNamesAndSalariesOfEmps() {
		// TODO Auto-generated method stub
		return null;
	}

}
