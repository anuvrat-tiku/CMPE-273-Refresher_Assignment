import static org.junit.Assert.*;
import org.junit.Test;

public class interfaceTest
{
    
    Barista interfaceTest = new Barista();

    @Test
    public void test1()
    {
        interfaceTest.setDecaf("1/2");
        interfaceTest.setShots("D");
        interfaceTest.setMilk("NF");
        interfaceTest.setDrink("L");
        assertEquals("Your Coffee: Decaf[1/2] Shots[D] Milk[NF] Drink[L]", interfaceTest.sendCommand());
    }


    @Test
    public void test2()
    {
        interfaceTest.setShots("D");
        interfaceTest.setDecaf("1/2");
        interfaceTest.setDrink("L");
        interfaceTest.setMilk("NF");
        assertEquals("Your Coffee: Decaf[1/2] Shots[D] Milk[NF] Drink[L]", interfaceTest.sendCommand());
    }

    @Test
    public void test3()
    {
        interfaceTest.setDecaf("NO");
        interfaceTest.setShots("1");
        interfaceTest.setMilk("NF");
        interfaceTest.setDrink("L");
        assertEquals("Your Coffee: Decaf[NO] Shots[1] Milk[NF] Drink[L]", interfaceTest.sendCommand());
    }
    
}

