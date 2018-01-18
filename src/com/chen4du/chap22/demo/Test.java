package com.chen4du.chap22.demo;

public class Test {

	public static void main(String[] args) {
		ILift lift = new Lift();
		lift.open();
		lift.close();
		lift.run();
		lift.stop();
	}
}
