package thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<6;i++) {
			System.out.println("child thread");
		}
	}

}
