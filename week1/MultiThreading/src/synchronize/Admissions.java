package synchronize;

public class Admissions implements Runnable{

	int seat=1;
	
	public static void main(String[] args) {
		// TODO Auto-generatet1d method stub
		Admissions admission = new Admissions();
		Thread t1 = new Thread(admission,"child-1");
		Thread t2 = new Thread(admission,"child-2");
		t1.start();
		t2.start();
		
		dis();
	}

		public static void dis(){
			System.out.println(Thread.currentThread().getName());
		}
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("no of seat :"+seat);
		if(seat>0) {
			System.out.println("seat allocated to :"+Thread.currentThread().getName());
			seat--;
		}else {
			System.out.println("sorry.. "+Thread.currentThread().getName());
		}
	}

}
