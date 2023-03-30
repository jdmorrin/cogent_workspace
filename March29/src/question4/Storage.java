package question4;

public class Storage {
	int x;
	boolean valSet = false;
	
	synchronized int printer() {
		while(!valSet) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing: " + x);
		valSet = false;
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		notify();
		return x;
	}
	
	synchronized void counter(int x) {
		while(valSet) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		this.x = x;
		valSet = true;
		System.out.println("Counting: " + x);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
	}
//	public Storage() {
//		
//	}
//	
//	public Storage(int x) {
//		this.x=x;
//	}
//
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
	
	
}
