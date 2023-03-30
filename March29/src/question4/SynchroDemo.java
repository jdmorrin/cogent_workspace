package question4;

public class SynchroDemo {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		Storage store = new Storage();
		new Counter(store);
		new Printer(store);
		
		
//		Storage store = new Storage();
//		Counter count = new Counter(store);
//		Printer print = new Printer(store);
//		
//		count.start();
//		print.start();
//		
//		for(int i =0; i<5;i++) {
//			count.wait();
//			print.wait();
//		}
//		
//		synchronized (count) {
//			synchronized (print) {
//				for(int i =0; i<=10;i++) {
//					count.wait();
//					
//					print.notify();
//					print.wait();
//					count.notify();
//				}
////				count.wait();
////				print.notify();
//			}
//		}
		

	}

}
