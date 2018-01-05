package com.chen4du.chap15.demo;

//角色 director
public class PersonDirector {

	public Person constructPerson(Builder p) {
		p.buildHead();
		p.buildBody();
		p.buildFoot();
		return p.buildPerson();
	}
}
