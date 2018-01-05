package com.chen4du.chap15.demo1;

//测试类
public class Test {

	public static void main(String[] args) {
		ManBuilder builder = new ManBuilder();
		Man man = builder.buildMan();
		System.out.println(man);
	}
}
