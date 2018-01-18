package com.chen4du.chap22.demo2;

public class RunningState extends LiftState{

	@Override
	public void open() {
	}

	@Override
	public void close() {
	}

	@Override
	public void run() {
		System.out.println("电梯上下跑");
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.stoppingState);
		super.context.getLiftState().stop();
	}
	

}
