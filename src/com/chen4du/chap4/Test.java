package com.chen4du.chap4;

import com.chen4du.chap4.access.DataAccess;
import com.chen4du.chap4.domain.Employee;
import com.chen4du.chap4.domain.Salary;

//测试类
public class Test {

	public static void main(String[] args) {
		DataAccess dataAccess = new DataAccess();
		Employee employee = new Employee();
		employee.setName("xiao hong");
		employee.setAge(22);
		employee.setSalary(new Salary() {
			@Override
			public void setFrom(String from) {
				super.setFrom("2017-12-27");
			};
			@Override
			public void setTo(String to) {
				super.setTo("2018-12-27");
			}
			@Override
			public void setAmount(double amount) {
				super.setTo("2018-12-27");
			}
			
		});
		dataAccess.saveEmployee(employee);
		dataAccess.removeEmployee(employee);
		
	}
}
