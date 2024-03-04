package custexception;
class z{
	
}
class A extends z implements Runnable{
	public void run() {
		for (int i=1;i<11;i++) {
			System.out.println("Hi");
		}
	}
}
class B extends z implements Runnable {
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println("Hello");
		}
	}
}

public class DemoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable a = () -> {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				for (int i=1;i<11;i++) {
					System.out.println("Hi");
				}
				// throughly
		};
		Runnable b = () -> {
			for (int i=1;i<11;i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}
}
