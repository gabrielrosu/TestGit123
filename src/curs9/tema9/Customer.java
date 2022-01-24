package curs9.tema9;

public class Customer {

    public String getName() {
        return name;
    }

    private String name;
    private String address;
    private String email;

    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }
}
