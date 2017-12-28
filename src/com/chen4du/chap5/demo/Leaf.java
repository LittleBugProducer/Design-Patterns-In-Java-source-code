package com.chen4du.chap5.demo;


//树叶
public class Leaf implements Component{

	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr+"-"+name);		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
