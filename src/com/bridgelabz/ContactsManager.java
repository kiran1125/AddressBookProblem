package com.bridgelabz;

import java.util.Scanner;

/**
 *This class is to manage the contacts
 */
public class ContactsManager {
    //Attributes
    Scanner sc = new Scanner(System.in);
    Contact contact;
    /**
     * this method is to add the contact
     */
    public void addingContact(){
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
        contact = new Contact(name, address, city, state, email, phoneNumber, zipCode);
    }

    /**
     * this method is to edit the existing contact
     */
    public void editingContact() {
        //using the scanner class taking the input from user to edit contact
        System.out.println("Enter the Name of contact to Edit");
        //taking the name from the user
        String name1 = sc.next();
        //checking the condition if the name which was added contact
        if (contact.name.equals (name1)) {
            //printing the statements that user want to choose
            System.out.println("\n1 : Change the name");
            System.out.println("2 : Change the address");
            System.out.println("3 : Change the city");
            System.out.println("4 : Change the state");
            System.out.println("5 : Change the emailId");
            System.out.println("6 : Change the Phone number");
            System.out.println("7 : Change the zipcode");
            System.out.println("0 : Exit");
            //taking user input as selection and checking that with switch case
            int selection = sc.nextInt();
            switch (selection) {
                case 1: {
                    System.out.println("Enter new Name");
                    contact.name = sc.next();       //changes the name to user defined name
                    break;
                }
                case 2: {
                    System.out.println("Enter new address");
                    contact.address = sc.next();           //changes the address by user defined address
                    break;
                }
                case 3: {
                    System.out.println("Enter the new city");
                    contact.city = sc.next();
                    break;
                }
                case 4: {
                    System.out.println("Enter the new state");
                    contact.state = sc.next();         //Changes the state
                    break;
                }
                case 5: {
                    System.out.println("Enter the new email");
                    contact.email = sc.next();        //Changes the email
                    break;
                }
                case 6: {
                    System.out.println("Enter the new phoneNumber");
                    contact.phoneNumber = sc.nextLong();     //changes the phone number
                    break;
                }
                case 7: {
                    System.out.println("Enter the new Zipcode");
                    contact.zipCode = sc.nextLong();         //changes the zipCode
                    break;
                }
                default:
                    break;
            }
            System.out.println("After Editing the contact");
            //  To print the contact after Editing
            System.out.println(contact.name + " " +contact.state + " " + contact.address + " " +contact.city + " " + contact.email + " " +contact.phoneNumber + " " + contact.zipCode);
        }


    }
}
