package com.chen4du.chap14.demo1;

public class Test {

	public static void main(String[] args) {
		ManBuilder builder = new ManBuilder();
		Man man = builder.buildMan();
		System.out.println(man);
	}
}
