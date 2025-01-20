package tourproject.PEOPLES;

public class EntityPeople {
    private long codemelli;
    private String fullName;
    private long phone;
    private String address;
    private long tourCode;

    public long getCode() {
        return codemelli;
    }

    public void setCode(long codemelli) {
        this.codemelli = codemelli;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTourCode() {
        return tourCode;
    }

    public void setTourCode(long tourCode) {
        this.tourCode = tourCode;
    }

}
