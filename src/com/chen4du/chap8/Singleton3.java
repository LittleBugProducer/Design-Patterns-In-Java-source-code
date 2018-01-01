package com.chen4du.chap8;

public class Singleton3 {

	private static class LazyHolder{
		private static final Singleton3 INSTANCE = new Singleton3();		
	}
	private Singleton3() {}
	public static final Singleton3 getInstance() {
		return LazyHolder.INSTANCE;
	}
}
