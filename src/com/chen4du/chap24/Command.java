package com.chen4du.chap24;

//命令的抽象类
public interface Command {

	void execute();
	void undo();
}
