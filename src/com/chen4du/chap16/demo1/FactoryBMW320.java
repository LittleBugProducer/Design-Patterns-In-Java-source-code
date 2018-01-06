package com.chen4du.chap16.demo1;

//具体工厂
public class FactoryBMW320 implements FactoryBMW{

	@Override
	public BMW createBMW() {
		return new BMW320();
	}
	

}
