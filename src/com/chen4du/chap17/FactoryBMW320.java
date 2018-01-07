package com.chen4du.chap17;

//具体工厂
public class FactoryBMW320 implements Factory{

	@Override
	public Engine createEngine() {
		return new EngineA();
	}

	@Override
	public AirCondition createAircondition() {
		return new AirConditionA();
	}
	

}
