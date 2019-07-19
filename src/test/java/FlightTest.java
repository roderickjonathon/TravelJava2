import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void setup(){
        flight = new Flight(PlaneType.BOEING747, FlightNum.AM356, Destination.AMS, DeptAirport.GLA, "1200");
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());
    }

    @Test
    public void canGetFlightNum(){
        assertEquals(FlightNum.AM356, flight.getFlightNum());
    }

    @Test
    public void canGetDestination() {
        assertEquals(Destination.AMS, flight.getDestination());
    }

    @Test
    public void canGetDeptAirpot() {
        assertEquals(DeptAirport.GLA, flight.getDeptAirport());
    }

    @Test
    public void canGetDeptTime(){
        assertEquals("1200", flight.getDeptTime());
    }

    @Test
    public  void startsWithNoPassengers(){
        assertEquals(0, flight.getNumOfPassengers());
    }

    @Test
    public void canGetNumOfAvailableSeats(){
        assertEquals(200, flight.getPlaneType().getCapacity());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger();
        assertEquals(199, flight.getPlaneType().getCapacity() );
    }


}
