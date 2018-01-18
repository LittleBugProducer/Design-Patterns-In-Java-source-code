package com.chen4du.chap24;

//银行系统Receiver
public class Ccb {

	public void saveMoney(long amount) {
		System.out.println("向建设银行存入金额"+amount);
	}
	public void fetchMoney(long amount) {
		System.out.println("从建设银行取出金额"+amount);
	}
}
