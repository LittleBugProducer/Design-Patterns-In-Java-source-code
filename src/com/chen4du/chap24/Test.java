package com.chen4du.chap24;

//使用ATM的人就是客户端Client
public class Test {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Command[] commands = new Command[3];
		commands[0] = new CcbDepositCommand();
		commands[1]=new CcbWithdrawCommand();
		commands[2]=new CmbWithdrawCommand();
		atm.setCommand(commands);
		atm.action(0);
		atm.cancel(0);
		atm.action(1);
		atm.cancel(1);
		atm.action(2);
		atm.cancel(2);
		
	}
}
