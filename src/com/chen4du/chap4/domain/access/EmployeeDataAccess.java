package com.chen4du.chap4.domain.access;

import com.chen4du.chap4.domain.Employee;

public class EmployeeDataAccess {

	public void saveEmployee(Employee employee) {
		System.out.println("Save employee to database.");
	}
	public void deleteEmployee(Employee employee)
	{
		System.out.println("Remove employee from database");
	}
}
