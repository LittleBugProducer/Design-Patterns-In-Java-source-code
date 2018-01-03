package com.chen4du.chap12;

//测试类
public class Test {

	public static void main(String[] args) {
		Handler pm = new ProjectManager();
		Handler dm = new DepManager();
		Handler gm = new GeneralManager();
		pm.setSuccessor(dm);
		dm.setSuccessor(gm);
		System.out.println(pm.handleFeeRequest("zs", 200));
		System.out.println(pm.handleFeeRequest("zs", 700));
		System.out.println(pm.handleFeeRequest("zs", 1500));
		System.out.println(pm.handleFeeRequest("zs", 15000));
	}
}
