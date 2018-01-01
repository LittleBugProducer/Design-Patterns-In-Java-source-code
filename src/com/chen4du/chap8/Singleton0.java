package com.chen4du.chap8;

public class Singleton0 {
	private Singleton0() {}
	private static Singleton0 single=null;
	public static Singleton0 getInstance() {
		if(single==null) {
			single = new Singleton0();
			
		}
		return single;
	}
}
