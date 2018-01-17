package com.chen4du.chap21;

//抽象类
public abstract class BubbleSorter {

	private int operations=0;
	protected int length=0;
	
	protected int doSort() {
		operations=0;
		if(length<=1) {
			return operations;
		}
		for(int nextToLast=length-1;nextToLast>=0;nextToLast--) {
			for(int index=0;index<nextToLast;index++) {
				if(outOfOrder(index)) {
					swap(index);
				}
				operations++;
			}
		}
		return operations;
	}
	
	protected abstract void swap(int index);
	
	public abstract boolean outOfOrder(int index) ;
}
