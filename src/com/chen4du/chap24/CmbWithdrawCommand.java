package com.chen4du.chap24;

public class CmbWithdrawCommand implements Command{

	private Cmb cmb = new Cmb();
	
	@Override
	public void execute() {
		cmb.quQian(100);
	}

	@Override
	public void undo() {
		cmb.cunQian(100);
	}
	

}
