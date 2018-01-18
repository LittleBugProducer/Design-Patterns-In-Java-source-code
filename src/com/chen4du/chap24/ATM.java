package com.chen4du.chap24;

//调用者invoker
public class ATM {

	private Command[] commands;
	
	public ATM() {
		this.commands = new Command[] {new NoCommand()};
	}
	
	public void setCommand(Command command[]) {
		this.commands = command;
	}
	
	public void action(int i) {
		this.commands[i].execute();
	}
	public void cancel(int i) {
		this.commands[i].undo();
	}
}
