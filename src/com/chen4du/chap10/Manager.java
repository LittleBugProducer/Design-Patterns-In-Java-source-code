package com.chen4du.chap10;

//调停者实现类
public class Manager implements Mediator{

	@Override
	public void change(String message, Engineer engineer, String name) {
		System.out.println("经理收到"+name+"的需求："+message);
		System.out.println("经理将"+name+"的需求发送给目标职员");
		engineer.called(message, name);
	}
	

}
