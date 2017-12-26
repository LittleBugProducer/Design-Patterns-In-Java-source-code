package com.chen4du.chap3.demo2;

//适配器类
public class AdapterClass extends Customer{

	private Action ac;
	
	public AdapterClass() {
		ac = new Action(); 
	}
	
	@Override
	public int CustomMethod() {
		int res = ac.ActionMethod();
		res*=10;
		System.out.println("服务：把一个苹果切成10小块");
		return res;
	}
	

}
