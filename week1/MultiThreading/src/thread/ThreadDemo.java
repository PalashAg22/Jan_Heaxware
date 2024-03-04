package thread;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		for(int i=0;i<20;i++) {
			System.out.println("main thread");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++)
			System.out.println(Thread.currentThread().getName()+" child thread");
	}
}
