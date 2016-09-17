
public class Thread_main {

	public static void main(String[] args) {
		Thread_setup th = new Thread_setup();
		new Transmitter(th);
		new Listener(th);
		System.out.println("To stop the thread execution click stop");

	}

}
