public class Drink extends Decorator {

	String d;
	public Drink(MainInterface newCoffee) {
		super(newCoffee);
	}
	
	public String getCommand() {
		if (d.isEmpty()) {
			return coffeedecorator.getCommand();
			} else return coffeedecorator.getCommand()+"Drink["+d+"]";
	}

	public void setOption(String o) {
		d = o;
		
	}
	
}
