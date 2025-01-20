package tourproject.HOTEL;

public class EntityHotel  {
    int hCode;
    long hNumber;
    long hPrice;
    String hName, hAddress, hPossibl;

    public int gethCode() { return hCode; }

    public EntityHotel sethCode(int hCode)
    {
        this.hCode = hCode;
        return this;
    }

    public String gethName() {
        return hName;
    }

    public EntityHotel sethName(String hName)
    {
        this.hName = hName;
        return this;
    }

    public String gethAddress() {
        return hAddress;
    }

    public EntityHotel sethAddress(String hAddress)
    {
        this.hAddress = hAddress;
        return this;
    }

    public long gethNumber() { return hNumber; }

    public EntityHotel sethNumber(long hNumber)
    {
        this.hNumber = hNumber;
        return this;
    }

    public String gethPossibl() {
        return hPossibl;
    }

    public EntityHotel sethPossibl(String hPossibl)
    {
        this.hPossibl = hPossibl;
        return this;
    }

    public long gethPrice() { return hPrice; }

    public EntityHotel sethPrice(long hPrice)
    {
        this.hPrice = hPrice;
        return this;
    }
}
