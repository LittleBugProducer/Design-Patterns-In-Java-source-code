package com.chen4du.chap16.demo1;

//测试类
public class Test {

	public static void main(String[] args) {
		FactoryBMW320 factoryBMW320 = new FactoryBMW320();
		BMW320 bmw320 = (BMW320) factoryBMW320.createBMW();
		FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		BMW523 bmw523 = (BMW523) factoryBMW523.createBMW();
	}
}
