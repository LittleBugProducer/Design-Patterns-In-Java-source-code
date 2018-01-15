package com.chen4du.chap18.demo1;

//具体原型
public class NewPrototype implements Cloneable{
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	private Prototype prototype;

	public Prototype getPrototype() {
		return prototype;
	}

	public void setPrototype(Prototype prototype) {
		this.prototype = prototype;
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
