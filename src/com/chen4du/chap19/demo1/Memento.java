package com.chen4du.chap19.demo1;

import java.util.Map;

public class Memento {

	private Map<String, Object>stateMap;
	public Memento(Map<String, Object>map) {
		this.stateMap = map;
	}
	public Map<String, Object> getStateMap() {
		return stateMap;
	}
	public void setStateMap(Map<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
	
}
