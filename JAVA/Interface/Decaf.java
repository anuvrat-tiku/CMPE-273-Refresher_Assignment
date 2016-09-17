public class Decaf extends Decorator {
	
	String dc;

	public Decaf(MainInterface newCoffee) {
		super(newCoffee);
		
	}


	public String getCommand() {
		
		if (dc == null) {
		return coffeedecorator.getCommand();
		} else return coffeedecorator.getCommand()+"Decaf["+dc+"] ";
		
	}

	public void setOption(String o) {
		dc = o;
		
	}
	
}
