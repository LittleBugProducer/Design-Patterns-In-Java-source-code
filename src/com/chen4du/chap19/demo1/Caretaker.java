package com.chen4du.chap19.demo1;

import java.util.HashMap;
import java.util.Map;

public class Caretaker {

	private Map<String, Memento>meMap = new HashMap<String,Memento>();
	public Memento getMemento(String index) {
		return meMap.get(index);
	}
	public void setMemento(String index,Memento memento) {
		this.meMap.put(index, memento);
	}
}
