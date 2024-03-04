package thread;

public class MyThreadRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunnable r  = new MyRunnable();
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		t1.start();
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
		t1.run();
		
	}

}
