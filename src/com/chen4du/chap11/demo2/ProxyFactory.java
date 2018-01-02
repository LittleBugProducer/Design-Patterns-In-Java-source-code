package com.chen4du.chap11.demo2;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

//代理工厂
public class ProxyFactory implements MethodInterceptor{

	private Object target;
	
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {		
		System.out.println("开始事务3");
		Object returnValue = arg1.invoke(target, arg2);
		System.out.println("提交事务...");
		return returnValue;
	}
	

}
