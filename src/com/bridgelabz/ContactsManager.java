package com.bridgelabz;

import java.util.Scanner;

/**
 *This class is to manage the contacts
 */
public class ContactsManager {
    //Attributes
    Scanner sc;
    /**
     * this method is to add the contact
     */
    public void add(){
        sc= new Scanner(System.in);
        //print the statement
        System.out.println("Enter the name");
        //assigning the name given by user to the name
        String name = sc.next();
        System.out.println("Enter the address");
        //defining the address given by user
        String address = sc.next();
        //printing the statement
        System.out.println("Enter the city");
        //defining the city given by the user
        String city = sc.next();
        System.out.println("Enter the state");
        //defining the state given by user
        String state = sc.next();
        System.out.println("Enter the emailId");
        //defining the emailId given by user
        String email = sc.next();
        System.out.println("Enter the Phone number");
        //defining the phoneNumber given by user
        long phoneNumber = sc.nextLong();
        System.out.println("Enter the zipcode");
        //defining the zipcode given by user
        long zipCode = sc.nextLong();
        //creating a contact
        Contact contact = new Contact(name, address, city, state, email, phoneNumber, zipCode);
    }
}
