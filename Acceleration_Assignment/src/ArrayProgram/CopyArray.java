package ArrayProgram;

public class CopyArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { a.length };

		b = a;

		System.out.println("elements of copy array");

		/*for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ",");
		}*/
		
		/*for(int c:b) {
			System.out.print(c+",");
			
		}*/
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			
		}

	}

}
