package com.chen4du.chap9;

import java.util.ArrayList;
import java.util.List;

//主题实现类
public class TeacherSubject implements Subject{

	private List<Observer>observers = new ArrayList<Observer>();
	
	private String info;
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if(i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for(int i = 0;i<observers.size();i++) {
			Observer o = (Observer)observers.get(i);
			o.update(info);
		}
	}
	public void setHomework(String info) {
		this.info = info;
		System.out.println("今天的作业是"+info);
		notifyObserver();
	}
	

}
