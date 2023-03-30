package question4;

public class Printer extends Thread{
	
	Storage store;
	Printer(Storage store){
		this.store=store;
		new Thread(this, "Printer").start();
	}
	public void run() {
		while(true) {
			store.printer();
		}
	}	
	
//	Storage store;
//	int x;
//	
//	public Printer(Storage store) {
//		this.store = store;
//	}
//	
//	public void run() {
//		synchronized (this) {
//			System.out.println("Printer is printing");
//			System.out.println(this.store.getX());
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Printer is printing");
//		System.out.println(this.store.getX());
		
		
//		synchronized (this) {
//			System.out.println(this.store.getX());
//			System.out.println("Printer notifies Counter");
//			this.notify();
//		}
//	}
}
