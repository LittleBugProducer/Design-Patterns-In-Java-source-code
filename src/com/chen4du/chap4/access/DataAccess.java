package com.chen4du.chap4.access;

import com.chen4du.chap4.domain.Employee;
import com.chen4du.chap4.domain.access.EmployeeDataAccess;
import com.chen4du.chap4.domain.access.SalaryDataAccess;

//门面类
public class DataAccess {

	private EmployeeDataAccess employeeDataAccess = new EmployeeDataAccess();
	private SalaryDataAccess salaryDataAccess = new SalaryDataAccess();
	
	public void saveEmployee(Employee employee) {
		employeeDataAccess.saveEmployee(employee);
		salaryDataAccess.saveSalary(employee.getSalary());
	}
	public void removeEmployee(Employee employee) {
		employeeDataAccess.deleteEmployee(employee);
		salaryDataAccess.deleteSalary(employee.getSalary());
	}
	
}
