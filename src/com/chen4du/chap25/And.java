package com.chen4du.chap25;

//非终结符表达式与
public class And extends Expression{

	private Expression left,right;
	
	public And(Expression left,Expression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean interpret(Context xtc) {		
		return left.interpret(xtc)&&right.interpret(xtc);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof And) {
			return left.equals(((And)obj).left)&&right.equals(((And)obj).right);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {

		return "("+left.toString()+" AND "+right.toString()+")";
	}
	

}
