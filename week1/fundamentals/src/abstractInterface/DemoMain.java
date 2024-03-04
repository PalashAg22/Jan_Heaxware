package abstractInterface;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 9;
		int nUM = 8;
		int Integer  =9;
		AbsDemoI obj = new ImpDemoAbs();
		obj.num = 100;
		System.out.println(obj.num);
		obj.dis();
		obj.insert();
		
		AbstractDemo obj2 = new AbstractImpl(); //cannot instantiate abstract class obj
		obj2.var=100;
		System.out.println(obj2.var);
	}

}
