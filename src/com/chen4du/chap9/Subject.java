package com.chen4du.chap9;

//主题接口
public interface Subject {

	void addObserver(Observer observer);
	void deleteObserver(Observer observer);
	void notifyObserver();
}
