package multithreading2;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMessage dm = new DisplayMessage();
		MyThread t1 = new MyThread(dm,"Mahondas");
		MyThread t2 = new MyThread(dm, "Indira");
		
		t1.start();
		t2.start();

	}

}
