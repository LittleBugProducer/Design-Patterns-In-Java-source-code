package com.chen4du.chap4.domain.access;

import com.chen4du.chap4.domain.Salary;

public class SalaryDataAccess {

	public void saveSalary(Salary salary) {
		System.out.println("Save salary to database");
		
	}
	public void deleteSalary(Salary salary) {
		System.out.println("Remove salary from database.");
	}
}
