import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    ArrayList<Passenger> passengers;

    @Before
    public void setup(){
        flight = new Flight(PlaneType.BOEING747, FlightNum.AM356, Destination.AMS, DeptAirport.GLA, "1200");
        passenger1 = new Passenger("Gary", 1);
        passenger2 = new Passenger("Harry", 1);
        passenger3 = new Passenger("Larry", 1);
        passenger4 = new Passenger("Mary", 1);
        passenger5 = new Passenger("Barry", 1);
        passenger6 = new Passenger("Sally", 1);
        passengers = new ArrayList<Passenger>();
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
        assertEquals(5, flight.getPlaneType().getCapacity());
    }

    @Test
    public void canBookPassenger(){

        flight.bookPassenger(FlightNum.AM356, passenger1);
        assertEquals(1, flight.getNumOfPassengers());
    }

    @Test
    public void wontAddPassengerIfNoSpace(){

        flight.bookPassenger(FlightNum.AM356, passenger1);
        flight.bookPassenger(FlightNum.AM356, passenger2);
        flight.bookPassenger(FlightNum.AM356, passenger4);
        flight.bookPassenger(FlightNum.AM356, passenger3);
        flight.bookPassenger(FlightNum.AM356, passenger5);
        flight.bookPassenger(FlightNum.AM356, passenger6);
        assertEquals(5, flight.getNumOfPassengers());
    }

    @Test
    public void canRemovePassengersFromFlight(){
        flight.bookPassenger(FlightNum.AM356, passenger1);
        flight.bookPassenger(FlightNum.AM356, passenger2);
        flight.bookPassenger(FlightNum.AM356, passenger4);
        assertEquals(3, flight.getNumOfPassengers());
        flight.removePassenger(passenger4);
        assertEquals(2, flight.getNumOfPassengers());
    }


}
