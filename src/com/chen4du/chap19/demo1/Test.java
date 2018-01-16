package com.chen4du.chap19.demo1;

public class Test {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		originator.setState1("我是");
		originator.setState2("一个");
		originator.setState3("单身汪");
		System.out.println("初始状态:"+originator);
		caretaker.setMemento("001", originator.createMemento());
		originator.setState1("现在");
		originator.setState2("我是");
		originator.setState3("汪汪");
		System.out.println("修改后状态:"+originator);
		originator.restoreMemento(caretaker.getMemento("001"));
		System.out.println("恢复后状态:"+originator);
		
	}
}
