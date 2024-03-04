package abstractInterface;

public class ImpDemoI  implements IDemo{
	@Override
	public void dis() {
		// TODO Auto-generated method stub
		System.out.println("implemented");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("implemented");
	}
	@Override
	public void show() {
		System.out.println("Override show mthd in impl class");
	}
	
	public  void helloWorld() {
		System.out.println("hello world mthd inside ImpDEmoI");
		
	}
	 
}

class main{
	public static void main(String args[]) {
		// TODO Auto-generated constructor stub
		System.out.println(IDemo.num);
		IDemo obj = new ImpDemoI();
		int n = obj.num;
		System.out.println(n);
		
		obj.dis();obj.insert();obj.show();
		
		
		
		
	}
}