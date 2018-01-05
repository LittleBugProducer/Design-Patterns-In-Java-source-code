package com.chen4du.chap15.demo;

//具体角色
public class WomanBuilder implements Builder{

	Person person;
	
	public WomanBuilder() {
		person = new Woman();
	}
	
	@Override
	public void buildHead() {
		person.setHead("建造女人的脑袋");
	}

	@Override
	public void buildBody() {
		person.setBody("建造女人的身体");
	}

	@Override
	public void buildFoot() {
		person.setFoot("建造女人的脚");
	}

	@Override
	public Person buildPerson() {
		return person;
	}
	

}
