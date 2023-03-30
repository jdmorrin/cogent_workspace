package question4;

public class Counter extends Thread{
	
	Storage store;
	Counter(Storage store){
		this.store = store;
		new Thread(this, "Counter").start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			store.counter(i++);
		}
	}
	
	
	
	
//	Storage store;
//	int count;
//	
//	public Counter(Storage store) {
//		this.store=store;
//	}
//	public void run() {
//		
		
		
//		synchronized(this) {
//			System.out.println("Counter is counting...");
//			this.count++;
//			System.out.println(this.count);
//			this.store.setX(count);
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Counter is counting...");
//		this.count++;
//		this.store.setX(count);
		
		
//		synchronized (this) {
//			for(int i =0; i<11;i++) {
//				System.out.println("Counter is counting");
//				this.store.setX(i);
//				try {
//					System.out.println("Counter is waiting for Printer");
//					this.wait();
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
		
//		for(int i =0; i<11;i++) {
//			this.store.setX(i);
//			this.wait();
//		}
//	}
}
