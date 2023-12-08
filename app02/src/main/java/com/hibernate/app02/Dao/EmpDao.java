package com.hibernate.app02.Dao;

import java.util.List;

import com.hibernate.app02.entity.EmployeeEntity;



public interface EmpDao {
	EmployeeEntity saveEmp(EmployeeEntity entity);
	
	List<EmployeeEntity> findEmployeesByDeptNo(Integer deptNo);
	
	List<Object[]> findNamesAndSalariesOfEmps();
}
