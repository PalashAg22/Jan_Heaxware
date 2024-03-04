package functional_interface;

public interface MyInterface {

	public abstract int add(int i, int j);
	default void show1() {
		System.out.println("show1 is default mthd call");
	}
	static void show2() {
		System.out.println("sjow2 is stataic mthd call");
	}
}
