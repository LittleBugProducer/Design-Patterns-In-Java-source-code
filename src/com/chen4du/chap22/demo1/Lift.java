package com.chen4du.chap22.demo1;

public class Lift implements ILift{
	
	private int state;

	public void setState(int state) {
		this.state=state;
	}
	
	private void closeWithoutLogic() {
		System.out.println("电梯门关闭");
	}
	
	private void openWithoutLogic() {
		System.out.println("电梯门开启");
	}
	
	private void runWithoutLogic() {
		System.out.println("电梯上下跑起来");
	}
	private void stopWithoutLogic() {
		System.out.println("电梯停止了");
	}

	public void open() {
		switch (this.state) {
		case OPENING_STATE:			
			break;
		case CLOSING_STATE:
			this.openWithoutLogic();
			this.setState(OPENING_STATE);
			break;
		case RUNNING_STATE:
			break;
		case STOPPING_STATE:
			this.openWithoutLogic();
			this.setState(OPENING_STATE);
			break;
		default:
			break;
		}
	}

	public void close() {
		switch (this.state) {
		case OPENING_STATE:
			this.closeWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
		case CLOSING_STATE:
			break;
		case RUNNING_STATE:
			break;
		case STOPPING_STATE:
			break;
		default:
			break;
		}
	}

	public void run() {
		switch (this.state) {
		case OPENING_STATE:
			
			break;
		case CLOSING_STATE:
			this.runWithoutLogic();
			this.setState(RUNNING_STATE);
			break;
		case RUNNING_STATE:
			break;
		case STOPPING_STATE:
			this.runWithoutLogic();
			this.setState(RUNNING_STATE);
			break;
		default:
			break;
		}
	}

	public void stop() {
		switch (this.state) {
		case OPENING_STATE:
			
			break;
		case CLOSING_STATE:
			this.stopWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
		case RUNNING_STATE:
			this.stopWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
		case STOPPING_STATE:
			break;
		default:
			break;
		}
	}
	

}
