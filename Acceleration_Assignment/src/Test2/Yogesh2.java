package Test2;

import Test1.Yogesh1;
import Test3.Yogesh3;

public class Yogesh2 {
	
	public int e;
	protected int f;
	int g;
	private int h;


	public static void main(String[] args) {
		
         Yogesh2 obj2=new Yogesh2();
     	System.out.println(obj2.e);
		System.out.println(obj2.f);
		System.out.println(obj2.g);
		System.out.println(obj2.h);
         
         Yogesh1 obj1=new Yogesh1();
         System.out.println(obj1.a);
         System.out.println(obj1.a);
         
         Yogesh3 obj3=new Yogesh3();
         System.out.println(obj3.i);
         System.out.println(obj3.i);
         

		
	

	}

}
