package com.chen4du.chap22.demo1;

public class Test {

	public static void main(String[] args) {
		ILift lift = new Lift();
		lift.setState(ILift.STOPPING_STATE);
		lift.open();
		lift.close();
		lift.run();
		lift.stop();
	}
}
