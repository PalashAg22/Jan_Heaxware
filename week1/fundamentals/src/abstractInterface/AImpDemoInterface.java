package abstractInterface;

public class AImpDemoInterface implements DemoInterface{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("inside implemented");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("inside implemented");
	}
	void printAll() {
		System.out.println("printall mthd ");
	}

}

class Main{
	public static void main(String[] args) {
		AImpDemoInterface inter = new AImpDemoInterface();
		inter.printAll();
		DemoInterface demo = new AImpDemoInterface();
		demo.display();
		demo.show();
	}
}