package com.chen4du.chap5.demo1;

import java.util.List;

//抽象构建类

public abstract class Component {
	public abstract void printStruct(String preStr);
	
	public void addChild(Component child) {
		throw new UnsupportedOperationException("对象不支持此功能");
	}
	
	public void removeChild(int index) {
		throw new UnsupportedOperationException("对象不支持此功能");
	}
	public List<Component>getChild(){
		throw new UnsupportedOperationException("对象不支持此功能");
	}
	

}
