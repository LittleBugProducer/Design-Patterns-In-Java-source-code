package com.chen4du.chap10;

//资料类
public class Test {

	public static void main(String[] args) {
		Mediator man = new Manager();
		Worker workerA = new Worker(man, "apple");
		Worker workerB = new Worker(man, "banana");
		Worker workerC = new Worker(man, "cat");
		workerA.call("这些资料需要B操作", workerB, "apple");
		workerB.call("这些资料需要C签名", workerC, "banana");
	}
}
