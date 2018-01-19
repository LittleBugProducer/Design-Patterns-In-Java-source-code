package com.chen4du.chap29.demo1;

public class CPA implements AccountBookView{
	int count = 0;
	
	public void view(ConsumerBill consumerBill) {
		count++;
		if(consumerBill.getItem().equals("消费")) {
			System.out.println("第"+count+"个单子消费了:"+consumerBill.getAmount());
		}
	}
	public void view(IncomeBill incomeBill) {
		count++;
		if(incomeBill.getItem().equals("收入")) {
			System.out.println("第"+count+"个单子收入了:"+incomeBill.getAmount());
		}
	}

}
