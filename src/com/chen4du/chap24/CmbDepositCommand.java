package com.chen4du.chap24;

public class CmbDepositCommand implements Command{

	private Cmb cmb = new Cmb();
	
	@Override
	public void execute() {
		cmb.cunQian(100);
	}

	@Override
	public void undo() {
		cmb.quQian(100);
	}
	

}
