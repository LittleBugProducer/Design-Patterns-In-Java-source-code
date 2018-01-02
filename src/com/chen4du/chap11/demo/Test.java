package com.chen4du.chap11.demo;

//测试类
public class Test {

	public static void main(String[] args) {
		UserDao target = new UserDao();
		UserDaoProxy proxy = new UserDaoProxy(target);
		proxy.save();
	}
}
