package com.chen4du.chap6.demo;

class Platform{
	public void program() {
		System.out.println("使用的平台");
	}
}
class WindowsPlatform extends Platform{
	@Override
	public void program() {
		System.out.println("使用Windows平台");
	}
}
class LinuxPlatform extends Platform{
	@Override
	public void program() {
		System.out.println("使用Linux平台");
	}	
}
class ServerWindowsPlatform extends WindowsPlatform{
	@Override
	public void program() {
		System.out.println("服务器攻城狮使用Windows平台开发");
	}
}
class ServerLinuxPlatform extends LinuxPlatform{
	@Override
	public void program() {
		System.out.println("服务器攻城狮使用Linux平台");
	}
}
class MobileWindowsPlatform extends WindowsPlatform{
	@Override
	public void program() {
		System.out.println("移动端攻城狮使用window平台");
	}
}
class MobileLinuxPlatform extends LinuxPlatform{
	@Override
	public void program() {
		System.out.println("移动端攻城狮使用Linux平台");
	}
}


public class Test {
	public static void main(String[] args) {
		ServerLinuxPlatform serverLinuxPlatform = new ServerLinuxPlatform();
		serverLinuxPlatform.program();
		ServerWindowsPlatform serverWindowsPlatform = new ServerWindowsPlatform();
		serverWindowsPlatform.program();
		MobileWindowsPlatform mobileWindowsPlatform = new MobileWindowsPlatform();
		mobileWindowsPlatform.program();
		MobileLinuxPlatform mobileLinuxPlatform = new MobileLinuxPlatform();
		mobileLinuxPlatform.program();
	}	
}
