import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setup(){
        passenger = new Passenger("Gary", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Gary", passenger.getname());
    }

    @Test
    public void hasBags(){
        assertEquals(2,passenger.getNumofBags());
    }
}
