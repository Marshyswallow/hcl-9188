package in.SpringCore.setterDi;

public class Employee {

    private Address address;
    Employee(){};

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayAddress(){
        System.out.println("Ballia");
    }
}
