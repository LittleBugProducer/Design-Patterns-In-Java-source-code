package com.chen4du.chap17;

//测试类
public class Test {

	public static void main(String[] args) {
		FactoryBMW320 factoryBMW320 = new FactoryBMW320();
		factoryBMW320.createEngine();
		factoryBMW320.createAircondition();
		
		FactoryBMW523 factoryBMW523 = new FactoryBMW523();
		factoryBMW523.createEngine();
		factoryBMW523.createAircondition();
	}
}
