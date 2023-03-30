package pkg;

class ItemQueue {
	int item;
	boolean valSet = false;
	
	synchronized int printer() {
		while(!valSet) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing: " + item);
		valSet = false;
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		notify();
		return item;
	}
	
	synchronized void counter(int item) {
		while(valSet) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		this.item = item;
		valSet = true;
		System.out.println("Counting: " + item);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}
}

class Counter implements Runnable{
	ItemQueue q;
	Counter(ItemQueue q){
		this.q = q;
		new Thread(this, "Counter").start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			q.counter(i++);
		}
	}
}

class Printer implements Runnable {
	ItemQueue q;
	Printer(ItemQueue q){
		this.q=q;
		new Thread(this, "Printer").start();
	}
	public void run() {
		while(true) {
			q.printer();
		}
	}
}

public class CounterPrinter{
	public static void main(String args[]) {
		ItemQueue q = new ItemQueue();
		new Counter(q);
		new Printer(q);
	}
}