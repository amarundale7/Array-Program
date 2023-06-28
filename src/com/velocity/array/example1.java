package com.velocity.array;

public class example1 {
	public static void main(String[] args) {
		// datatype variable arraysymbol = new datatype [array size]
		int a[] = new int[5];// Instatiation and declaration
		// how to initialize array
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println("Length og array>>" + a.length);
		for (int i = 0; i <= a.length; i++) {
			System.out.println(a[i]);

		}

	}

}
