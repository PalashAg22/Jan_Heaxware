package custexception;

public class DemoD  {
	int divide1(int i, int j) throws DemoExc {
		if(j==0) {
			throw new DemoExc("cannot divide by zero inside D");
		}
		return i/j;
	}
}
