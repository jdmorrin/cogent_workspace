package multithreading;

public class MultiThreaded extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreaded mt = new MultiThreaded();
		mt.setPriority(MAX_PRIORITY);
		mt.setName("Shiva");
		mt.start();
		
		MultiThreaded mt1 = new MultiThreaded();
		mt1.setPriority(MIN_PRIORITY);
		mt1.setName("Rafael");
		mt1.start();
	}

	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
	}
}
