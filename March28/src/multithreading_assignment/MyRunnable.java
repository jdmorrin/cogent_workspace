package multithreading_assignment;

public class MyRunnable implements Runnable{
	public MyRunnable() {
		
	}
	
	public void run() {
		
		for(int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			
		}
	}
}
