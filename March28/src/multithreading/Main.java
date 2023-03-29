package multithreading;

//class MyThread implements Runnable{
//	public void run() {
//		for(int i = 0; i<=10; i++) {
//			System.out.println("i:"+i+"\t");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//}

class MyThread extends Thread{
	
	MyThread(){
		super("Demo Thread");
		System.out.println("The child thread: " + this);
		start();
	}
	
	public void run() {
		for(int i = 5; i>0; i--) {
			System.out.println("Child thread:"+i+"\t");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting child thread");
	}
}

public class Main {

	public static void main(String[] args) {
		
//		MyThread mt = new MyThread();
//		Thread t = new Thread(mt);
//		t.start();
//		
//		for(int j = 0; j<=10;j++) {
//			System.out.println("j:"+j+"\t");
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		new MyThread();
		for(int i=5;i>0;i--) {
			System.out.println("Main thread: " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Exiting main thread");
	}
	
	
}
