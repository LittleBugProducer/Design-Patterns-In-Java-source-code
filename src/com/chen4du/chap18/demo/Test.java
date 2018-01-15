package com.chen4du.chap18.demo;

//测试类
public class Test {

	public static void main(String[] args) {
		Prototype prototype = new Prototype();
		prototype.setName("original object");
		Prototype prototype2 = (Prototype)prototype.clone();
		prototype2.setName("changed object1");
		
		System.out.println("original object:"+prototype.getName());
		System.out.println("cloned object:"+prototype2.getName());
		
	}
	
}
