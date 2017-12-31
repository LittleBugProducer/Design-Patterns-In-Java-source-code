package com.chen4du.chap6.demo1;

//RefinedAbstraction扩充抽象类
public class LinuxPlatform extends Platform{

	public LinuxPlatform(Monkey monkey) {
		this.monkey = monkey;
	}
	
	@Override
	public void program() {
		monkey.type();
		System.out.println("使用linux平台!");
	}
}
