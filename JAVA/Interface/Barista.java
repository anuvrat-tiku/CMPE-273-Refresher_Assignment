public class Barista
{
	MainInterface newCoffee;
	String decaf;
	String shots;
	String milk;
	String drink;
    
	Decaf dc;
	Shots s;
	Milk m;
	Drink d;
	
    Barista() {
    	decaf = null;
    	shots = null;
    	milk = null;
    	drink = null;
    	
    }

    public void setDecaf(String s)
    {
    	decaf = s;
    }
    
    public void setShots(String s)
    {
    	shots = s;	
    }

    public void setMilk(String s)
    {
        milk = s;
    }
    
    public void setDrink(String s)
    {
        drink = s;
    }
    
    public String sendCommand()
    {
        newCoffee = new ImplementsMainInterface();
        
        dc = new Decaf(newCoffee);
        dc.setOption(decaf);
        
        s = new Shots(dc);
        s.setOption(shots);
        
        m = new Milk(s);
        m.setOption(milk);
        
        d = new Drink(m);
        d.setOption(drink);
        
        return d.getCommand();
        		
    }
}

