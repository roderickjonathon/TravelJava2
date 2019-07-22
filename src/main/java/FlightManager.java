public class FlightManager {


    private FlightManager flightManager;
    private Passenger passenger;
    private Plane plane;

    public FlightManager(Passenger passenger, Plane plane){
        this.passenger = passenger;
        this.plane = plane;

    }


    public int bagWeight(Passenger passenger) {
        return passenger.getNumofBags() * 10;
    }

    public int planeWeightLimit(Flight flight) {
        return flight.getPlaneType().getWeight();

    }


//    public int wieghtAllowedPerPassenger(Flight flight) {
//
//    }
}
