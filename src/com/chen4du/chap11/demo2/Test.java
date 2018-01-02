package com.chen4du.chap11.demo2;

//测试类
public class Test {

	public static void main(String[] args) {
		UserDao target = new UserDao();
		System.out.println(target.getClass());
		UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();
		System.out.println(proxy.getClass());
		proxy.save();
	}
}
