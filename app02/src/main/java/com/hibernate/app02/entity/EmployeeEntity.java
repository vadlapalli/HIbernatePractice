package com.hibernate.app02.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP")
public class EmployeeEntity {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empNumber;
	
	@Column(name = "ENAME")
	private String empName;
	
	@Column(name = "SAL")
	private Double sal;
	
	private Integer deptNo;

	public Integer getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(Integer empNumber) {
		this.empNumber = empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empNumber=" + empNumber + ", empName=" + empName + ", sal=" + sal + ", deptNo=" + deptNo
				+ "]";
	}
	
	
}
