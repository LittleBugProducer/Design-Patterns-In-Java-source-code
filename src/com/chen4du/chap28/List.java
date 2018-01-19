package com.chen4du.chap28;

//定义容器角色
public interface List {

	public void add(Object obj);
	public Object get(int index);
	public Iterator iterator();
	public int getSize();
}
