package com.chen4du.chap8.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;

public class Singleton implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static Singleton instance = null;
	private static int i = 1;
	private Singleton() {
		if(i == 1) {
			i++;
		}else {
			throw new RuntimeException("只能调用一次构造函数");
		}
		System.out.println("调用Singleton的私有构造器");
	}
	public static synchronized Singleton getInstance() {
		if(instance==null) {
			synchronized (Singleton.class) {
				if(instance==null) {
					instance = new Singleton();
				}				
			}
		}
		return instance;
	}
	public Object readResolve() {
		return instance;
	}
	public static void main(String[] args) throws Exception{
		//test2();
		test1();
		
	}
	public static void test1()throws Exception{
		Singleton singleton = Singleton.getInstance();
		Class c = Singleton.class;
		Constructor privateConstructor;
		try {
			privateConstructor = c.getDeclaredConstructor();
			privateConstructor.setAccessible(true);
			privateConstructor.newInstance();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public static void test2()throws Exception{
		Singleton s = Singleton.getInstance();
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream(new File("C:\\Users\\lC\\Desktop\\Singleton.txt")));
		objectOutputStream.writeObject(s);
		ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream(new File("C:\\Users\\lC\\Desktop\\Singleton.txt")));
		Singleton s1 = (Singleton)objectInputStream.readObject();
		System.out.println("s.hashCode():"+s.hashCode()+",s1.hashCode():"+s1.hashCode());
		objectOutputStream.flush();
		objectOutputStream.close();
		objectInputStream.close();
	}
	
	

}
