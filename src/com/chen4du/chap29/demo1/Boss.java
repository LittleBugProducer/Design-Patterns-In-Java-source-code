package com.chen4du.chap29.demo1;

public class Boss implements AccountBookView{

	private double totalConsume;
	private double totalIncome;
	
	
	@Override
	public void view(ConsumerBill oConsumerBill) {
		totalConsume = totalConsume+oConsumerBill.getAmount();
	}

	@Override
	public void view(IncomeBill incomeBill) {
		totalIncome+=incomeBill.getAmount();
	}
	
	public void getTotalConsume() {
		System.out.println("老板一共消费了"+totalConsume);
	}
	public void getTotalIncome() {
		System.out.println("老板一共收入了"+totalIncome);
	}
	

}
