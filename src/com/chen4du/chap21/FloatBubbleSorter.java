package com.chen4du.chap21;

//具体类
public class FloatBubbleSorter extends BubbleSorter{

	private float[] array=null;
	
	
	
	public float[] getArray() {
		return array;
	}

	public void setArray(float[] array) {
		this.array = array;
	}

	public int sort(float[] theArray) {
		array = theArray;
		length = array.length;
		return doSort();
	}
	
	@Override
	protected void swap(int index) {
		float temp = array[index];
		array[index]=array[index+1];
		array[index+1]=temp;
	}

	@Override
	public boolean outOfOrder(int index) {
		return (array[index]>array[index+1]);
	}
	

}
