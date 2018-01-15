package com.chen4du.chap18.demo2;

//测试类
public class Test {

	public static void main(String[] args) {
		Prototype prototype = new Prototype();
		prototype.setName("original object");
		NewPrototype newob = new NewPrototype();
		newob.setId("test1");
		newob.setPrototype(prototype);
		
		NewPrototype copyObj = (NewPrototype)newob.clone();
		copyObj.setId("testCopy");
		copyObj.getPrototype().setName("change object");
		System.out.println("original object id:"+newob.getId());
		System.out.println("original object name:"+newob.getPrototype().getName());
		System.out.println("cloned object id:"+copyObj.getId());
		System.out.println("cloned object name:"+copyObj.getPrototype().getName());
	}
}
