package com.chen4du.chap29.demo;

public class MedicineB extends Medicine{

	public MedicineB(String name, double price) {
		super(name, price);
		
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitor(this);
	}

}
