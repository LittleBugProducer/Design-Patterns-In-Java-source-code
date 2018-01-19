package com.chen4du.chap25;

//非终结符表达式或
public class Or extends Expression{
	private Expression left,right;
	
	public Or(Expression left,Expression right) {
		this.left = left;
		this.right = right;		
	}

	@Override
	public boolean interpret(Context xtc) {
		return left.interpret(xtc)||right.interpret(xtc);		
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof Or) {
			return this.left.equals(((Or)obj).left)&&this.right.equals(((Or)obj).right);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return "("+left.toString()+" OR "+right.toString()+")";
	}
	

}
