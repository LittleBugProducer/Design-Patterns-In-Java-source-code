package com.chen4du.chap6.demo2;

//扩展的具体实现
public class ALiComponey extends Company{

	public ALiComponey(Platform platform) {
		this.platform = platform;
		
	}
	
	
	@Override
	public void work() {
		System.out.print("四十大盗公司的");
		this.platform.program();
	}
	

}
