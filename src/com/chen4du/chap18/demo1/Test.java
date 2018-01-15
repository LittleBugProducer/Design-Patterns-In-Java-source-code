package com.chen4du.chap18.demo1;

//测试类
public class Test {
	public static void main(String[] args) {
		Prototype prototype = new Prototype();
		prototype.setName("original object");
		NewPrototype newobj = new NewPrototype();
		newobj.setId("test1");
		newobj.setPrototype(prototype);
		NewPrototype copyobj = (NewPrototype)newobj.clone();
		copyobj.setId("testCopy");
		copyobj.getPrototype().setName("changed object");
		
		System.out.println("original object id:"+newobj.getId());
		System.out.println("original objcet name:"+newobj.getPrototype().getName());
		System.out.println("cloned object id:"+copyobj.getId());
		System.out.println("cloned object name:"+copyobj.getPrototype().getName());
	}

}
