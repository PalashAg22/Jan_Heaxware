package exception;

public class ExpDemo {

	public static void main(String[] args) { // caller
		// TODO Auto-generated method stub
		int rs = 0;
		try {
		rs = div(10,0);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(rs);
	}

	private static int div(int i, int j)throws ArithmeticException { // callee
		// TODO Auto-generated method stub
		return i/j;
	}

}
