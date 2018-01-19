package com.chen4du.chap25;

//非终结符表达式非
public class Not extends Expression{
	private Expression exp;
	
	public Not(Expression exp) {
		this.exp = exp;
	}

	@Override
	public boolean interpret(Context xtc) {
		return !exp.interpret(xtc);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null&&obj instanceof Not) {
			return exp.equals(((Not)obj).exp);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		return "(Not "+exp.toString()+")";
	}
	

}
