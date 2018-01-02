package com.chen4du.chap11.demo;

//被代理对象
public class UserDao implements IUserDao{

	@Override
	public void save() {
		System.out.println("------已经保存数据-------");
	}
}
