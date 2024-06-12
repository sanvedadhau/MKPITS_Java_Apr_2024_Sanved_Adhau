package StrudentRecord;

public class StudentBulk {
    private String RollNo;
    private String Name;
    private String Address;
    private String City;

    public StudentBulk(String rollNo, String name, String address, String city) {
        RollNo = rollNo;
        Name = name;
        Address = address;
        City = city;
    }

    public StudentBulk() {
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
