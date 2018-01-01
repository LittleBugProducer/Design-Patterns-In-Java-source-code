package com.chen4du.chap10;

//职员抽象类
public abstract class Engineer {

	String name;
	private Mediator mediator;
	public Engineer(Mediator mediator,String name) {
		this.mediator = mediator;
		this.name = name;
	}
	//被调停者调用的方法
	public void called(String message,String nname) {
		System.out.println(name+"接收到来自"+nname+"的需求："+message);
	}
	//调用调停者
	public void call(String message,Engineer engineer,String nname) {
		System.out.println(nname+"发起需求："+message);
		mediator.change(message, engineer, nname);
	}
}
