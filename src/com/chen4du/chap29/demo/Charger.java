package com.chen4du.chap29.demo;

public class Charger extends Visitor{

	@Override
	public void visitor(MedicineA a) {
		System.out.println("收银员:"+name+"给药"+a.getName()+"扣款:"+a.getPrice());
	}

	@Override
	public void visitor(MedicineB b) {
		System.out.println("收银员:"+name+"给药"+b.getName()+"扣款:"+b.getPrice());
	}
	

}
