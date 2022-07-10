package ArrayProgram;

public class Max_Array {

	public static void main(String[] args) {
		int a[] = { 50, 60, 100, 70, 80, 90 };

		int max = a[0];

		for (int i = 1; i < a.length; i++) {

			if (max <a[i]) {
				max = a[i];

			}

		}
		System.out.println("Max array is " + max);

	}

}
