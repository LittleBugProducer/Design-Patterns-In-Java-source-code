package com.chen4du.chap23;

public class Test {

	public static void main(String[] args) {
		Context context = new Context(new AirplaneStrategy());
		context.travel();
		
		context.setTravelStrategy(new TrainStrategy());
		context.travel();
		
		context.setTravelStrategy(new BicycleStrategy());
		context.travel();
	}
}
