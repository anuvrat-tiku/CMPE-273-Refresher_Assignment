public class MainBarista {

	public static void main(String[] args) {
		Barista interfaceTest = new Barista();
		System.out.println("Welcome to Anuvrat's coffee!");
		System.out.println("Your order");
		
		//First Order
		interfaceTest.setDrink("L");
        interfaceTest.setShots("1");
        interfaceTest.setMilk("NF");
        System.out.printf(interfaceTest.sendCommand());
        
        System.out.println("");
        
        //Second Order
        interfaceTest.setShots("3");
        interfaceTest.setMilk("HH");
        interfaceTest.setDrink("L");
        System.out.printf(interfaceTest.sendCommand());
        

	}

}
