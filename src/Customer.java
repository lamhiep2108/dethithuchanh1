public class Customer {
    private int id;
    private String name;
    private String dateOfBirth;
    private int identity;
    private int numberOfDayRented;
    private String roomType;
    private int roomRate;

    public Customer(int id,String name, String dateOfBirth, int identity, int numberOfDayRented, String roomType, int roomRate) {
        this.id=id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.identity = identity;
        this.numberOfDayRented = numberOfDayRented;
        this.roomType = roomType;
        this.roomRate = roomRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public int getNumberOfDayRented() {
        return numberOfDayRented;
    }

    public void setNumberOfDayRented(int numberOfDayRented) {
        this.numberOfDayRented = numberOfDayRented;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomRate() {
        return roomRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoomRate(int roomRate) {
        this.roomRate = roomRate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", identity=" + identity +
                ", numberOfDayRented=" + numberOfDayRented +
                ", roomType='" + roomType + '\'' +
                ", roomRate=" + roomRate +
                '}';
    }
}
