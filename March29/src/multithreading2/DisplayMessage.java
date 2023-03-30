package multithreading2;

public class DisplayMessage {
	public synchronized void sayHello(String str) {
		for(int i = 0;i <=10;i++) {
			System.out.println("How are you " + str);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
