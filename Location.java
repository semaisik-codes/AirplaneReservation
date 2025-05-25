public class Location extends BaseEntity {
    private String country;
    private String city;
    private String airport;
    private boolean isActive;

    public Location(int id, String country, String city, String airport, boolean isActive) {
        super(id);
        this.country = country;
        this.city = city;
        this.airport = airport;
        this.isActive = isActive;
    }

    public String getCountry() { return country; }
    public String getCity() { return city; }
    public String getAirport() { return airport; }
    public boolean isActive() { return isActive; }

    @Override
    public String toString() {
        return "Location: " + airport + " - " + city + ", " + country + " [" + (isActive ? "Active" : "Inactive") + "]";
    }
}
