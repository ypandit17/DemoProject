package ArrayProgram;

public class Duplicate_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,6,5,6,2};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate element is :"+arr[j]);
				}
				
			}
			
		}

	}

}
