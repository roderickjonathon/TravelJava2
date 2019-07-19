import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType plane;
    private FlightNum flightNum;
    private Destination destination;
    private DeptAirport deptAirport;
    private String deptTime;


    public Flight(PlaneType plane, FlightNum flightNum, Destination destination, DeptAirport deptAirport, String deptTime){
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.deptAirport = deptAirport;
        this.deptTime = deptTime;
        this.passengers =  new ArrayList<Passenger>();
    }


    public PlaneType getPlaneType() {
        return this.plane;}

    public FlightNum getFlightNum() {
        return this.flightNum;
    }

    public Destination getDestination() {
        return destination;
    }

    public DeptAirport getDeptAirport() {
        return deptAirport;
    }

    public String getDeptTime() {
        return deptTime;
    }

    public int getNumOfPassengers() {
        return passengers.size();
    }

    public void bookPassenger(){

    }


}
