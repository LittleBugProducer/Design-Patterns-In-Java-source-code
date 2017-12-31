package com.chen4du.chap6.demo2;

//扩展的具体实现
public class GoogleComponey extends Company{

	public GoogleComponey(Platform platform) {
		this.platform = platform;
		
	}
	
	@Override
	public void work() {
		System.out.print("Google公司的");
		this.platform.program();
	}
	

}
