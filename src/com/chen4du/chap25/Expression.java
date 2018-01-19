package com.chen4du.chap25;


//抽象表达式角色
public abstract class Expression {
	public abstract boolean interpret(Context xtc);
	
	public abstract boolean equals(Object obj);
	
	public abstract int hashCode();
	
	public abstract String toString();

}
