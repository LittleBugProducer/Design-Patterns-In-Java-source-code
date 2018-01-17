package com.chen4du.chap21;

//具体类
public class IntBubbleSorter extends BubbleSorter{
	private int[] array=null;
	
	public int Sort(int[] theArray) {
		array = theArray;
		length = array.length;
		return doSort();
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	@Override
	protected void swap(int index) {
		int temp = array[index];
		array[index] = array[index+1];
		array[index+1]=temp;
	}

	@Override
	public boolean outOfOrder(int index) {
		return (array[index]>array[index+1]);
	}
	

}
