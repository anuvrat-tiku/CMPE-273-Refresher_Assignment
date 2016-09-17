public class Shots extends Decorator {

	String s;
	
	public Shots(MainInterface newCoffee) {
		super(newCoffee);
		
	}


	public String getCommand() {
		
		if (s.isEmpty()) {
			return coffeedecorator.getCommand();
			} else return coffeedecorator.getCommand()+"Shots["+s+"] ";
	}

	public void setOption(String o) {
		s = o;
		
	}
	
}
