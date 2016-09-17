
public class Transmitter implements Runnable {

	Thread_setup th;
		
		Transmitter(Thread_setup th) {
			this.th = th;
				new Thread(this, "Transmitted signal : ").start();
			}
		
		@Override
		public void run() {
				int i = 0;
				while(true) {
					th.transmit(i++);
		}
	}
}

