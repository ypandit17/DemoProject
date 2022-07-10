package Test1;

import Test2.Yogesh2;
import Test3.Yogesh3;

public class Yogesh1 {
	public int a;
	protected int b;
	int c;
	private int d;

	public static void main(String[] args) {
		
		Yogesh1 obj1=new Yogesh1();
		
		System.out.println(obj1.a);  
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		System.out.println(obj1.d);
		
        Yogesh2 obj2=new Yogesh2();
        System.out.println(obj2.e);
        System.out.println(obj2.e);
        
		Yogesh3 obj3 = new Yogesh3();
		System.out.println(obj3.i);  
		System.out.println(obj3.i);
		

        


	}

}
