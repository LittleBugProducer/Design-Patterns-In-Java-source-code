package com.chen4du.chap27;

public class CondimentDecorator implements Drink{

	protected Drink decoratorDrink;
	
	public CondimentDecorator(Drink decoratorDrink) {
		this.decoratorDrink = decoratorDrink;
	}
	
	
	@Override
	public float cost() {
		return decoratorDrink.cost();
	}

	@Override
	public String getDescription() {
		return decoratorDrink.getDescription();
	}
	

}
