package com.chen4du.chap15.demo;

//测试类
public class Test {
	public static void main(String[] args) {
		PersonDirector pd = new PersonDirector();
		Person womanPerson = pd.constructPerson(new WomanBuilder());
		System.out.println(womanPerson);
		Person manPerson = pd.constructPerson(new ManBuilder());
		System.out.println(manPerson);
	}

}
