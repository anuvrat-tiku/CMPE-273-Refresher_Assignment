import org.junit.Test;
public class thread_test {
	
	Thread_setup test1 = new Thread_setup();
	Thread_setup test2 = new Thread_setup();
	
	@Test
	public void test1() { 
		//Transmitter has sent messages using thread1
		//Listener is listening for thread2
		//Only 1 message will be displayed for transmitting message 0	
		new Transmitter(test1);
		new Listener(test2);
	}
	
	@Test
	public void test2() { 
		//Only 2 signals will be transmitted. Both threads will send message0 
		//Since there are no listeners, only 2 messages will be produced.
		new Transmitter(test1);
		new Transmitter(test2);
	}
	
	@Test
	public void test3() { 
		//Two messages will be transmitted by the 2 threads.
		//Listeners are present for only one thread.
		//For thread2 the execution will stop after sending the first message.
		new Transmitter(test1);
		new Transmitter(test2);
		new Listener(test1);
	}
	
	@Test
	public void test4() {
		//Only listeners are active. No transmitters are sending.
		//Nothing will happen.
		new Listener(test2);
		new Listener(test1);
	}
}
