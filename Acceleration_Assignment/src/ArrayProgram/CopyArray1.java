package ArrayProgram;

import java.util.Arrays;

public class CopyArray1 {

	public static void main(String[] args) {

		System.out.println("elements of old Array");
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(a));
		
		System.out.println("elements of new Array");
		int[] newArray = Arrays.copyOf(a, a.length);
		for (int newArray2 : newArray) {
			System.out.print(newArray2 + ",");

		}

	}

}
