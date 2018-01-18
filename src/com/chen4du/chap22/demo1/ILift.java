package com.chen4du.chap22.demo1;

public interface ILift {

	final static int OPENING_STATE=1;
	final static int CLOSING_STATE=2;
	final static int RUNNING_STATE=3;
	final static int STOPPING_STATE=4;
	void setState(int state);
	void open();
	void close();
	void run();
	void stop();
}
