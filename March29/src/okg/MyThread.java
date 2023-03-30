package okg;

public class MyThread extends Thread{
	int total;
	
	public void run() {
		System.out.println("Child thread is calculating the sum");
		synchronized (this) {
			for(int i = 1; i<=100;i++) {
				this.notify();
				total += i;
//				this.notify();
			}
//			this.notify();
		}
	}
}
