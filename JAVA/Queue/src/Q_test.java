import org.junit.Test;

public class Q_test {

	@Test
	public void test1() {
		System.out.println(Word_mapper.check_Palindrome("")); //EMPTY STRING
	}
	
	@Test
	public void test2() {
		System.out.println(Word_mapper.check_Palindrome("NAMAN")); //IS A PALINDROME
	}
	
	@Test
	public void test3() {
		System.out.println(Word_mapper.check_Palindrome("HELLO")); //NOT A PALINDROME
	}
}
