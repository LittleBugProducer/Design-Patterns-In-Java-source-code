package com.chen4du.chap29.demo1;

public class ConsumerBill implements Bill{

	private String item;
	private double amount;
	
	public ConsumerBill(String item,double amount) {
		this.item = item;
		this.amount = amount;
	}
	
	public String getItem() {
		return item;
	}
	
	public double getAmount() {
		return amount;
	}	
	
	@Override
	public void accept(AccountBookView viewer) {
		viewer.view(this);
	}
	

}
