public class Reservation extends BaseEntity {
    private String firstName;
    private String lastName;
    private int age;
    private Flight flight;
    private int seatNumber;

    public Reservation(int id, String firstName, String lastName, int age, Flight flight, int seatNumber) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public Flight getFlight() { return flight; }
    public int getSeatNumber() { return seatNumber; }

    @Override
    public String toString() {
        return "Reservation ID: " + id +
                "\nPassenger: " + firstName + " " + lastName + ", Age: " + age +
                "\nFlight: " + flight.getDepartureLocation().getCity() + " -> " + flight.getArrivalLocation().getCity() +
                "\nSeat No: " + seatNumber;
    }
}
