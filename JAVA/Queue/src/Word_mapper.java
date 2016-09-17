import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Word_mapper {

	
	Word_mapper() {
	}
	
	public static String check_Palindrome(String string) {
		if (string.isEmpty()) {
			return "Input is empty !!";
		}
		
		Stack<Character> S = new Stack<Character>();
		Queue<Character> Q = new LinkedList<Character>();
		
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			S.push(c);
			Q.add(c);
		}
	
		while(!S.isEmpty() && !Q.isEmpty()) {
			if (S.peek() != Q.peek()) {
				return "String is NOT A PALINDROME!!";
			} 
			if (S.peek() == Q.peek()) {
				S.pop();
				Q.poll();
			}
		}
		return "String IS A PALINDROME";
	}
}
