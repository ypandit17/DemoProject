 package ArrayProgram;

public class Count_Array {

	public static void main(String[] args) {
		
		int arr[] ={1,2,3,3,2,1,4,5,6};
		int count=0;
		
		for(int i:arr) {
			System.out.print(i+",");
			count++;
			
		}
		System.out.print("No of Counts:"+count+",");

	}

}
