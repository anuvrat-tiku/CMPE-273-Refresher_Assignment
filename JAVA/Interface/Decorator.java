
public abstract class Decorator implements MainInterface{
	
	protected MainInterface coffeedecorator;
	String a;
	
	public Decorator(MainInterface newCoffee) {
		this.coffeedecorator = newCoffee;
		
	}
	
	
	public String getCommand() {
		return coffeedecorator.getCommand();
	}
	
	public void setOption(String o) {
	   a = o;
	   }

}
