public class Milk extends Decorator {

	String m;
	public Milk(MainInterface newCoffee) {
		super(newCoffee);
		
	}


	public String getCommand() {
		if (m.isEmpty()) {
			
			return coffeedecorator.getCommand();
			} else return coffeedecorator.getCommand()+"Milk["+m+"] ";
	}

	public void setOption(String o) {
		m = o;
		
	}
	
}
