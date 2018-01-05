package com.chen4du.chap14.demo;

//具体角色
public class ManBuilder implements Builder{

	Person person;
	
	public ManBuilder() {
		person = new Man();
	}
	
	@Override
	public void buildHead() {
		person.setHead("建造男人的脑袋");
	}

	@Override
	public void buildBody() {
		person.setBody("建造男人的身体");
	}

	@Override
	public void buildFoot() {
		person.setFoot("建造男人的脚");
	}

	@Override
	public Person buildPerson() {
		return person;
	}
	

}
