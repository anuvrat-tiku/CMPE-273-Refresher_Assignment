import java.util.Stack;

public class Stack_body {
	
	public static boolean Parse(String x)
	{
	    if (x.isEmpty()) {
	    	System.out.println("Braces are closed in PROPER Sequence");
	        return true;
	    }

	    Stack<Character> stack = new Stack<Character>();
	    for (int i = 0; i < x.length(); i++)
	    {
	        char stackTop = x.charAt(i);
	        if (stackTop == '{' || stackTop == '(' || stackTop == '[')
	        {
	            stack.push(stackTop);
	        }


	        if (stackTop == '}' || stackTop == ')' || stackTop == ']')
	        {
	            if (stack.isEmpty())
	            {
	            	System.out.println("Braces are not in sequence");
	                return false;
	            }

	            char last = stack.peek();
	            if (stackTop == '}' && last == '{' || stackTop == ')' && last == '(' || stackTop == ']' && last == '[')
	                stack.pop();
	            else { 
	            	System.out.println("Braces are not in sequence");
	                return false;
	            }
	        }

	    }

	    return stack.isEmpty();
	}
}
