package com.chen4du.chap3.demo1;

//适配器
public class AdapterClass extends Action implements ICustomer{

	@Override
	public int CustomMethod() {
		int res = ActionMethod();
		res*=10;
		System.out.println("适配:把苹果切成块");
		return res;
	}
	

}
