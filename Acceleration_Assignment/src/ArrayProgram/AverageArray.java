package ArrayProgram;

public class AverageArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int sum=0;
		int avg=0;
		
		/*for(int b:a) {
			sum=sum+b;
			
		}*/
		
		for(int i=1;i<=a.length-1;i++) {
			sum=sum+ a[i];
		}
		
		 avg=sum/a.length; //150/5
		System.out.println(avg); //30

	}

}
