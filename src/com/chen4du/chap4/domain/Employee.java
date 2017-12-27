package com.chen4du.chap4.domain;

public class Employee {

	private String name;
	private int age;
	private Salary salary;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
}
