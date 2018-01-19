package com.chen4du.chap27;

public class Coffee implements Drink{

	final private String description="coffee";
	
	@Override
	public float cost() {
		return 10;
	}

	@Override
	public String getDescription() {
		return description;
	}
	

}
