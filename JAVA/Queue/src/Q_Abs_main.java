import java.util.Scanner;

public class Q_Abs_main {
	public static void main(String[] args) {
		System.out.println("Enter the string you want to be checked");
		
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();

		System.out.println(Word_mapper.check_Palindrome(x));
		
		s.close();
		
		System.out.println("Breakpoint");
	}
}
