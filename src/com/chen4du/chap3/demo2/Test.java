package com.chen4du.chap3.demo2;

//测试类
public class Test {

	public static void main(String[] args) {
		Customer customer = new AdapterClass();
		int res = customer.CustomMethod();
		System.out.println(res+"块苹果");
	}
}
