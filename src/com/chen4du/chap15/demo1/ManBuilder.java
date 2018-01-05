package com.chen4du.chap15.demo1;

//Builder
public class ManBuilder {

	Man man;
	public ManBuilder() {
		man = new Man();
	}
	public void buildHead() {
		man.setHead("建造男人的头");
		
	}
	public void buildBody() {
		man.setBody("建造男人的身体");
	}
	public void buildFoot() {
		man.setFoot("建造男人的脚");
	}
	
	public Man buildMan() {
		buildHead();
		buildBody();
		buildFoot();
		return man;		
	}
	
}
