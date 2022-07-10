package ArrayProgram;

public class Sumof2Arrays {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 60, 70, 80, 90, 50 };
		int c[] = new int[a.length];

		System.out.println("Sum of 2 Arrays");
		for (int i = 0; i <= a.length - 1; i++) {
			//System.out.print(i+",");
			c[i] = a[i] + b[i];
			System.out.print(c[i] + ",");
		}
		/*
		 * System.out.println("sum of 2 arraays"); for(int j=0;j<=c.length-1;j++) {
		 * System.out.println(c[j]);
		 * 
		 * }
		 */

	}

}
