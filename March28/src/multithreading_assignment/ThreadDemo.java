package multithreading_assignment;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		MyRunnable t2 = new MyRunnable();
		
		//Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		t1.setName("One");
		th2.setName("Two");
		
		t1.setPriority(10);
		th2.setPriority(5);
		
		t1.start();
		th2.start();

		
	}

}
