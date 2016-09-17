
public class Thread_setup {
	
	int x;
	boolean ThreadIsSet = false;
	
	synchronized int hear() {
		while(!ThreadIsSet)
			try {
				wait();
			} 
		catch(InterruptedException e) {
			System.out.println("Thread Exception");
		}
		System.out.println("Listener has recieved message : " + x);
		ThreadIsSet = false;
		notify();
		return x;
		}
		synchronized void transmit(int x) {
			while(ThreadIsSet)
				try {
					wait();
				} 
			catch(InterruptedException e) {
				System.out.println("Thread Exception");
			}
			
			this.x = x;
			ThreadIsSet = true;
			System.out.println("Transmitter has sent message : " + x);
			notify();
		}
}
