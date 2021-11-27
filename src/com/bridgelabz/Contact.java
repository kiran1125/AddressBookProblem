package com.bridgelabz;

public class Contact {
    //Attributes for contact
    String name, address, city, state, email;
    long phoneNumber, zipCode;

    /**
     * parameterised constructor to create contact object
     * @param name
     * @param address
     * @param city
     * @param state
     * @param email
     * @param phoneNumber
     * @param zipcode
     */
    public Contact(String name, String address, String city, String state, String email , long phoneNumber, long zipcode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipcode;
    }

    public String toString() {
        return String.format( "name : " + name + " address : " + address + " city : " + city + " email : " +
                email + " phoneNumber : " + phoneNumber + " zipCode : " + zipCode);
    }
}
