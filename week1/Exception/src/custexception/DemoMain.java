package custexception;

import java.util.Scanner;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scn = new Scanner(System.in);
//		//scn.close();
//		System.out.println("getting input");
//		int n = scn.nextInt();
//		
		DemoD d = new DemoD();
//		DemoE e = new DemoE();
//		//DemoC c = new DemoC();
//		System.out.println(DemoC.multiply(5,6)); // creating static mthd and calling it by class name
		try {
			d.divide1(5, 0);
		}catch(DemoExc e1) {
			
			System.out.println("my exc: "+e1);
			//e1.printStackTrace();
		
		}
	}

}
