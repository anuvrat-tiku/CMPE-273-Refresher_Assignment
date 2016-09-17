
public class Listener implements Runnable {

	Thread_setup th;
	
	Listener(Thread_setup th) {
		this.th = th;
		new Thread(this, "Listening to signal : ").start();
	}
	
	
	@Override
	public void run() {
		while(true) 
		{
			th.hear();
			}
		}

}
