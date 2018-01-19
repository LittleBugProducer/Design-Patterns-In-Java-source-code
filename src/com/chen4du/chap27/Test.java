package com.chen4du.chap27;

public class Test {

	public static void main(String[] args) {
		Drink drink = new Coffee();
		System.out.println(drink.getDescription()+":"+drink.cost());
		drink = new Milk(drink);
		System.out.println(drink.getDescription()+":"+drink.cost());
		drink = new Sugar(drink);
		System.out.println(drink.getDescription()+":"+drink.cost());
		drink = new Sugar(drink);
		System.out.println(drink.getDescription()+":"+drink.cost());
		
	}
}
