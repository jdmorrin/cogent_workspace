package multithreading_assignment;

public class MyThread extends Thread{
	public MyThread() {
		
	}
	
	public void run() {
		
		for(int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			
		}
	}
}
