package tourproject.tour;

public class EntityTour {

    private long code;
    private String name;
    private String range;
    private String vehicle;
    private String places;
    private long payment;
    private String manager;
    private String hotelName;
    private String people;

    public long getCode() {
        return code;
    }
    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRange() {
        return range;
    }
    public void setRange(String range) {
        this.range = range;
    }

    public long getPayment() {
        return payment;
    }
    public void setPayment(long payment) {
        this.payment = payment;
    }

    public String getManager() {
        return manager;
    }
    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getVehicle() {
        return vehicle;
    }
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getPlaces() {
        return places;
    }
    public void setPlaces(String places) {
        this.places = places;
    }

    public String getPeople() { return people; }
    public void setPeople(String paople) {
        this.people = people;
    }

}
