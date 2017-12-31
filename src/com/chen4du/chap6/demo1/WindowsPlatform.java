package com.chen4du.chap6.demo1;

//RefinedAbstraction扩充抽象类
public class WindowsPlatform extends Platform{

	public WindowsPlatform(Monkey monkey) {
		this.monkey = monkey;
	}
	
	@Override
	public void program() {
		monkey.type();
		System.out.println("使用window平台!");
	}
}
