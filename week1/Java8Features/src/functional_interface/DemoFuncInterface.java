package functional_interface;

public class DemoFuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface mi = (int i, int j) ->i+j;
		System.out.println(mi.add(4, 5));
	}

}
