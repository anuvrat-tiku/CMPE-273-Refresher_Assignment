import org.junit.Test;

public class Q_test {

	@Test
	public void test1() {
		Q_str QQ = new Q_str();
		QQ.insert_Q(1);
		QQ.insert_Q(15);
	}
	
	@Test
	public void test2() {
		Q_str QQ = new Q_str();
		QQ.remove_Q();
		QQ.remove_Q();
		QQ.remove_Q();
	}
	
}
