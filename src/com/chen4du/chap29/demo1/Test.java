package com.chen4du.chap29.demo1;

public class Test {

	public static void main(String[] args) {
		Bill consumerBill = new ConsumerBill("消费", 3000);
		Bill incomeBill = new IncomeBill("收入", 4000);
		Bill consumerBill2 = new ConsumerBill("消费", 5000);
		Bill incomeBill2 = new IncomeBill("收入", 10000);
		AccountBook accountBook = new AccountBook();
		accountBook.add(consumerBill);
		accountBook.add(incomeBill);
		accountBook.add(consumerBill2);
		accountBook.add(incomeBill2);
		AccountBookView boss = new Boss();
		AccountBookView cpa = new CPA();
		accountBook.show(boss);
		accountBook.show(cpa);
		((Boss)boss).getTotalConsume();
		((Boss)boss).getTotalIncome();
	}
}
