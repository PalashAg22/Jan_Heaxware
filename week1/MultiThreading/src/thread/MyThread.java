package thread;

public class MyThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		t1.setPriority(MAX_PRIORITY - 1);
		t1.setName("child-1");
		//System.out.println(t1);
		
		MyThread t2 = new MyThread();
		t2.setPriority(MIN_PRIORITY+3);
		t2.setName("child-2");
		//System.out.println(t2);
		System.out.println(t1.isAlive());
		System.out.println(t2.isDaemon());
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
			System.out.println(Thread.currentThread().getName()+"child thread called..");
		}
	}
}
