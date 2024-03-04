package functional_interface;

public class ImpJava7 implements MyInterface {

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	public static void main(String[] args) {
		MyInterface mi = new ImpJava7();
		int res = mi.add(5, 5);
		System.out.println(res);
		MyInterface.show2();
		mi.show1();
	}
}
