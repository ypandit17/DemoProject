package ArrayProgram;

public class Merge_Array {

	public static void main(String[] args) {
		int a[] = { 30, 40, 50, 60 };
		int b[] = { 70, 80, 90, 100 };

		int a_length = a.length;
		int b_length = b.length;
		int c_length = a_length + b_length;

		int c[] = new int[c_length];

		for (int i = 0; i < a_length; i++) {
			c[i] = a[i];

		}
		for (int i = 0; i < b_length; i++) {
			c[a_length + i] = b[i];
		}

		for (int i = 0; i < c_length; i++) {
			System.out.print(c[i]+",");

		}

	}

}
