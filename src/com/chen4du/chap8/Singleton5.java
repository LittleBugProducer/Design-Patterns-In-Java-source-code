package com.chen4du.chap8;

public enum Singleton5 {

	SingletonEnum("单例的枚举方式",34);
	private String str;
	private int num;	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	private Singleton5(String str,int num) {
		this.setStr(str);
		this.setNum(num);
	}
	
	
}
