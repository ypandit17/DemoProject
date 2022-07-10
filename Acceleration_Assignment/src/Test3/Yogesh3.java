package Test3;

import Test1.Yogesh1;
import Test2.Yogesh2;

public class Yogesh3 extends Yogesh1 {

	public int i;
	protected int j;
	int k;
	private int l; 

	public static void main(String[] args) {

		Yogesh3 obj3 = new Yogesh3();
		/*System.out.println(obj3.i);
		System.out.println(obj3.j);
		System.out.println(obj3.k);
		System.out.println(obj3.l);*/
		System.out.println("i am protected member of Yogesh1 : " +obj3.b);
		
		Yogesh1 obj1 = new Yogesh1();
		System.out.println(obj1.a);
		//System.out.println(obj1.a);
		
		Yogesh2 obj2 = new Yogesh2();
		// System.out.println(obj2.e);
		//System.out.println(obj2.e);

		
	}

}
