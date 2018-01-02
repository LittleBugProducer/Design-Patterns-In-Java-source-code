package com.chen4du.chap11.demo1;

//测试类
public class Test {

	public static void main(String[] args) {
		IUserDao target = new UserDao();
		System.out.println(target.getClass());
		IUserDao proxy = (IUserDao)new ProxyFactory(target).getProxyInstance();
		System.out.println(proxy.getClass());
		proxy.save();
	}
}
