import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class ShipTest {

    private ShipA a;
    private ShipB b;
    private ShipC c;

    @Before
    public void beforetest(){

            a = new ShipA(1,2);
            b = new ShipB(2,4);
            c = new ShipC(3,6);
    }

    @Test
    public void atest(){
        System.out.println("ShipA testing...");
        a.shoot(1,2);
        Assert.assertEquals(a.isAlive(), true);
        Assert.assertEquals(a.isAlive(), true );
    }

}