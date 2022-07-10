package ArrayProgram;

public class Min_Array {

	public static void main(String[] args) {
		int a[] = { 60, 70, 80, 10, 90 };
		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (min>a[i] ) {
				min = a[i];

			}

		}
		System.out.println(min);

	}

}
