package com.chen4du.chap25;

//终结符表达式常量
public class Constant extends Expression{

	private boolean value;
	
	public Constant(boolean value) {
		this.value = value;
		
	}
	
	@Override
	public boolean interpret(Context xtc) {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof Constant){
			return this.value ==((Constant)obj).value;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return new Boolean(value).toString();
	}

	
}
