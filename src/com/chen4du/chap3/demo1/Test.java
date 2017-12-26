package com.chen4du.chap3.demo1;

//测试类
public class Test {

	public static void main(String[] args) {
		ICustomer customer = new AdapterClass();
		System.out.println(customer.CustomMethod()+"块");
	}
}
