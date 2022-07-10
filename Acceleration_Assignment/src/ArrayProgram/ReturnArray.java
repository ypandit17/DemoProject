package ArrayProgram;

import java.util.Arrays;

public class ReturnArray {
	

	public static void main(String[] args) {
		
		ReturnArray obj=new ReturnArray();
		
		
		
		int [] b=obj. numbers();
		
		/*for (int c : b) {
			System.out.print(c + ",");

		}*/
		
		System.out.println(Arrays.toString(b));

	}

	public  int[] numbers() {

		int a[] = { 1, 2, 3, 4, 5 };
		return a;
		

	}

}
