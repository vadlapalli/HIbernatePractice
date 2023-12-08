package com.hibernate.app02;

import com.hibernate.app02.Dao.EmpDao;
import com.hibernate.app02.Dao.Impl.EmpDaoImpl;
import com.hibernate.app02.entity.EmployeeEntity;

public class Main {
    public static void main( String[] args ){
    	
    	EmpDao dao=new EmpDaoImpl();
        
		/*
		 * EmployeeEntity entity = new EmployeeEntity(); entity.setEmpName("Hari");
		 * entity.setSal(60000.0); entity.setDeptNo(500);
		 */
    	
		
		  EmployeeEntity entity1 = new EmployeeEntity(); entity1.setEmpName("Babu");
		   entity1.setSal(65000.0); entity1.setDeptNo(501);
		 
    	
    	dao.saveEmp(entity1);
    	
    }
}
