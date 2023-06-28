package com.min.number;
// To find minimum number by using array
public class MinNumber {

	public static void main(String[] args) {
		int[] a = new int[] { 20, 15, 35, 25, 45 };
		int min = a[0]; // 20,20,20,35
		System.out.println("Length of array is>>" + a.length);
		// 0<5-T, 1<5-T, 2<5-T, 3<5-T, 4<5-T

		for (int i = 0; i < a.length; i++) {
			// 20>20-F 15>20-F, 35>20-T , 25>35-F, 45>35-T
			if (a[i] < min) {
				min = a[i];// 20, 35 , 45

			}
		}

		System.out.println("Min number of array is>>" + min);

	}
}

		

	


