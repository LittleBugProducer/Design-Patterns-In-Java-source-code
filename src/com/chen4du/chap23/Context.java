package com.chen4du.chap23;

public class Context {
	private TravelStrategy travelStrategy = null;
	public Context(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
		
	}
	public TravelStrategy getTravelStrategy() {
		return travelStrategy;
	}
	public void setTravelStrategy(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}
	
	public void travel() {
		travelStrategy.travelAlgorithm();
	}

}
