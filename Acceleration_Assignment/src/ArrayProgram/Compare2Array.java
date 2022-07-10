package ArrayProgram;

import java.util.Arrays;

public class Compare2Array {

	public static void main(String[] args) {

		int a1[] = { 10, 20, 30, 40, 50, 60 };
		int a2[] = { 10, 20, 30, 40, 50, 60 };

		/*
		 * if (Arrays.equals(a1, a2)) { System.out.println("a1 and a2 are equal"); }
		 * 
		 * else { System.out.println("a1 and a2 are not equal");
		 * 
		 * }
		 */

		if (Arrays.equals(a1, a2)) {
			System.out.println("a1 & a2 are same");
		} else {
			System.out.println("a1 & a2 are not same");
		}
		
		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = arr1;
		int arr3[] = { 15, 25, 35, 45, 55 };
		int arr4[] = { 15, 25, 35, 45, 55 };

		System.out.println("Compare arr1 & arr2");
		if (arr1 == arr2)
			System.out.println("arr1 & Arr2 are same");
		else
			System.out.println("arr1 & arr2 are not same");

		System.out.println(" compare arr1 & arr3");

		if (arr1 == arr3)
			System.out.println("arr1 & arr3 are same ");
		else
			System.out.println("arr1 & arr3 are not same");

		System.out.println("compare arr1 & arr4 ");
		if (arr1 == arr4)
			System.out.println("arr1 & arr4 are equal");
		else
			System.out.println("arr1 & arr4 are not equal");

	}

}
