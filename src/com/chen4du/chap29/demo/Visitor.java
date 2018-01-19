package com.chen4du.chap29.demo;

public abstract class Visitor {
	protected String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void visitor(MedicineA a);
	
	public abstract void visitor(MedicineB b);

}
