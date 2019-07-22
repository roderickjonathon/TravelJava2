import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;

    Plane plane1;
    Flight flight1;

    @Before
    public void setup() {
        plane1 = new Plane(PlaneType.BOEING747);
        passenger1 = new Passenger("Gary", 1);
        passenger2 = new Passenger("Larry", 1);
        passenger3 = new Passenger("Larry", 1);
        passenger4 = new Passenger("Mary", 1);
        passenger5 = new Passenger("Barry", 1);
        flightManager = new FlightManager(passenger1, plane1);
        flight1 = new Flight(PlaneType.BOEING747, FlightNum.AM356, Destination.AMS, DeptAirport.GLA, "1200");
    }

    @Test
    public void baggageHasWeight() {
        assertEquals(10, flightManager.bagWeight(passenger2));


    }

    @Test
    public void planeHasWeightLimit(){
        assertEquals(200, flightManager.planeWeightLimit(flight1));
    }

//    @Test
//    public void weightAllowedPerPassenger(){
//        flight1.bookPassenger(FlightNum.AM356, passenger1);
//        flight1.bookPassenger(FlightNum.AM356, passenger2);
//        flight1.bookPassenger(FlightNum.AM356, passenger3);
//        flight1.bookPassenger(FlightNum.AM356, passenger4);
//        flight1.bookPassenger(FlightNum.AM356, passenger5);
//        assertEquals(20, flightManager.wieghtAllowedPerPassenger(flight1));
//    }

//    @Test
//    public void customersBaggageReducesAvailableWeight(){
//        flight1.bookPassenger(FlightNum.AM356, passenger2);
//        assertEquals();
//    }

}
