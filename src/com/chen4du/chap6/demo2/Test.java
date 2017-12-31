package com.chen4du.chap6.demo2;

//测试类
public class Test {

	public static void main(String[] args) {
		Monkey monkeyS = new ServerMonkey();
		Monkey monkeyM = new MobileMonkey();
		Platform platform = new WindowsPlatform(monkeyS);
		platform.program();
		Company company = new GoogleComponey(platform);
		company.work();
		platform = new WindowsPlatform(monkeyM);
		platform.program();
		company = new ALiComponey(platform);
		company.work();
		platform = new LinuxPlatform(monkeyS);
		platform.program();
		company = new GoogleComponey(platform);
		company.work();
		platform = new LinuxPlatform(monkeyM);
		platform.program();
		company = new ALiComponey(platform);
		company.work();
	}
}
