package abstractInterface;

public interface IDemo {

	int num=9; // final static
	void dis();
	void insert();
	
	default void show() {
		System.out.println("inside interface demo");
	}
	
	static void showAll() {
		System.out.println("using static mthd inside interface demo");
	}
	
}

