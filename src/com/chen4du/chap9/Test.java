package com.chen4du.chap9;

//测试类
public class Test {

	public static void main(String[] args) {
		TeacherSubject t = new TeacherSubject();
		StudentObserver zs = new StudentObserver("张三", t);
		StudentObserver ls = new StudentObserver("李四", t);
		StudentObserver ww = new StudentObserver("王五", t);
		t.setHomework("p2");
		t.setHomework("p6");
		t.setHomework("p56-p65");
	}
}
