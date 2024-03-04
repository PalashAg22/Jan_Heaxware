package custexception;

public class DemoC {
void tempMehtod(){
	System.out.println("Hello world inside DemoC");
}
/*
 * DemoD d= new DemoD(); DemoE e = new DemoE();
 */
	int divide3(int i, int j, int k) throws DemoExc{
		return (i+j)/k;
	}
	static int multiply(int i, int j) {
		return i*j;
	}
	
}
