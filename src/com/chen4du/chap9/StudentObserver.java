package com.chen4du.chap9;

//观察者实现类
public class StudentObserver implements Observer{

	private TeacherSubject t;
	private String name;
	
	public StudentObserver(String name,TeacherSubject t) {
		this.name = name;
		this.t = t;
		t.addObserver(this);
	}
	
	@Override
	public void update(String info) {
		System.out.println(name+"得到作业:"+info);
	}
	

}
