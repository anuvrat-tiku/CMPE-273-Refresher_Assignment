import org.junit.Test;

public class Stack_test {
	
	@Test
	public void test1() {
		System.out.println(Stack_body.Parse("[{()}]"));//True in order
	}
	
	@Test
	public void test2() {
		System.out.println(Stack_body.Parse("[{(})]"));//False Not in order
	}
	
	@Test
	public void test3() {
		System.out.println(Stack_body.Parse("[{("));//False Incomplete
	}
	
	@Test
	public void test4() {
		System.out.println(Stack_body.Parse("[{(){["));//False incomplete
	}
	
	@Test
	public void test5() {
		System.out.println(Stack_body.Parse("[()]"));//True in order
	}
	
}
