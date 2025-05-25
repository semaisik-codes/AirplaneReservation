import java.time.LocalDateTime;

public class Flight extends BaseEntity {
    private Airplane airplane;
    private Location departureLocation;
    private Location arrivalLocation;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public Flight(int id, Airplane airplane, Location departureLocation, Location arrivalLocation,
                  LocalDateTime departureTime, LocalDateTime arrivalTime) {
        super(id);
        this.airplane = airplane;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Airplane getAirplane() { return airplane; }
    public Location getDepartureLocation() { return departureLocation; }
    public Location getArrivalLocation() { return arrivalLocation; }
    public LocalDateTime getDepartureTime() { return departureTime; }
    public LocalDateTime getArrivalTime() { return arrivalTime; }

    @Override
    public String toString() {
        return "Flight ID: " + id +
                "\nAirplane: " + airplane.getBrand() + " " + airplane.getModel() +
                "\nFrom: " + departureLocation.getCity() + " To: " + arrivalLocation.getCity() +
                "\nDeparture: " + departureTime +
                "\nArrival: " + arrivalTime;
    }
}
