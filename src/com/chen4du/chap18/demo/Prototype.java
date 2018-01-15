package com.chen4du.chap18.demo;

//具体原型
public class Prototype implements Cloneable{
	private String name;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Object clone() {
		try {
			return super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}
	}

}
