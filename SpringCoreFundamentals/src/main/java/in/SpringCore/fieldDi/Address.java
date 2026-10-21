package in.SpringCore.fieldDi;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private Address address;

    public void showAddress() {
        System.out.println("Address: Ghaziabad, Uttar Pradesh");

    }
}
