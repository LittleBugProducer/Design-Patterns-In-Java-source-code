package com.chen4du.chap29.demo;

public class Test {

	public static void main(String[] args) {
		Medicine a = new MedicineA("板蓝根", 11.0);
		Medicine b = new MedicineB("感康", 14.3);
		
		Presciption presciption = new Presciption();
		presciption.addMedicine(a);
		presciption.addMedicine(b);
		
		Visitor charger = new Charger();
		charger.setName("张三");
		Visitor workerOfPharmacy = new WorkerOfPharmacy();
		workerOfPharmacy.setName("李四");
		presciption.accept(charger);
		System.out.println("------------------");
		presciption.accept(workerOfPharmacy);
	}
}
