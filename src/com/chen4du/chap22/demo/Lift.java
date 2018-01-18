package com.chen4du.chap22.demo;

public class Lift implements ILift{

	@Override
	public void open() {
		System.out.println("电梯门打开");
	}

	@Override
	public void close() {
		System.out.println("电梯门关闭");
	}

	@Override
	public void run() {
		System.out.println("电梯运行");
	}

	@Override
	public void stop() {
		System.out.println("电梯停止");
	}
	

}
