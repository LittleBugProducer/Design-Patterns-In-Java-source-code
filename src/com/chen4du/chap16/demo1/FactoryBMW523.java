package com.chen4du.chap16.demo1;

//具体工厂
public class FactoryBMW523 implements FactoryBMW{

	@Override
	public BMW createBMW() {
		return new BMW523();
	}
	

}
