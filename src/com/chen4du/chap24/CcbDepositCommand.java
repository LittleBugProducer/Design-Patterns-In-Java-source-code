package com.chen4du.chap24;

public class CcbDepositCommand implements Command{

	private Ccb ccb = new Ccb();
	
	@Override
	public void execute() {
		ccb.saveMoney(100);
	}

	@Override
	public void undo() {
		ccb.fetchMoney(100);
	}
	

}
