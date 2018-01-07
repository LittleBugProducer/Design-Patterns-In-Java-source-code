package com.chen4du.chap17;

//具体工厂
public class FactoryBMW523 implements Factory{

	@Override
	public Engine createEngine() {
		return new EngineB();
	}

	@Override
	public AirCondition createAircondition() {
		return new AirConditionB();
	}
	

}
