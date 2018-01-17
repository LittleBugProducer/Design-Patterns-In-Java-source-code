package com.chen4du.chap21;

public class Test {

	public static void main(String[] args) {
		int[] intArray=new int[] {5,3,12,8,10};
		IntBubbleSorter sorter = new IntBubbleSorter();
		sorter.Sort(intArray);
		for (int i : intArray) {
			System.out.print(i+" ");
		}
		System.out.println();
		float[] floatArray = new float[] {5.0f,3.0f,12.0f,8.0f,10.0f};
		FloatBubbleSorter sorter2 = new FloatBubbleSorter();
		sorter2.sort(floatArray);
		for (float f : floatArray) {
			System.out.print(f+" ");
		}
		System.out.println();
	}
}
