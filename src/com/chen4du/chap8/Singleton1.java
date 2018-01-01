package com.chen4du.chap8;

public class Singleton1 {

	private Singleton1() {}
	private static Singleton1 single=null;
	public static synchronized Singleton1 getInstance() {
		if(single==null) {
			single = new Singleton1();
			
		}
		return single;
	}
}
