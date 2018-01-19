package com.chen4du.chap29.demo1;

import java.util.ArrayList;
import java.util.List;

public class AccountBook {

	private List<Bill>listBill = new ArrayList<Bill>();
	public void add(Bill bill) {
		listBill.add(bill);
	}
	public void show(AccountBookView viewer) {
		for(Bill b:listBill) {
			b.accept(viewer);
		}
	}
}
