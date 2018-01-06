package com.chen4du.chap16.demo;

//测试类
public class Test {
	public static void main(String[] args) {
		Factory factory = new Factory();
		BMW bmw320 = factory.createBMW(320);
		BMW bmw523 = factory.createBMW(523);
	}

	
}
