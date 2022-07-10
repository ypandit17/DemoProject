package ArrayProgram;

public class PrintArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };

		/*
		 * System.out.println(Arrays.toString(a));
		 * 
		 * for (int b : a) { System.out.print(b+","); }
		 * 
		 * int b[] = { 10, 20, 30, 40, 50 }; for(int i=0;i<a.length;i++) {
		 * System.out.print(b[i]+",");
		 */

		int j = 0;
		while (j < a.length) {
			System.out.print(a[j] + ",");
			j++;

		}

	}

}
