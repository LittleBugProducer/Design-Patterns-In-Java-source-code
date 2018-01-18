package com.chen4du.chap24;

public class CcbWithdrawCommand implements Command{

	private Ccb ccb = new Ccb();

	@Override
	public void execute() {
		ccb.fetchMoney(100);
	}

	@Override
	public void undo() {
		ccb.saveMoney(100);
	}
	
	
}
