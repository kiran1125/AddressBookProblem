package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *This class is to manage the contacts
 */
public class AddressBook {
    //Attributes
    Scanner sc = new Scanner(System.in);
    //collection to store the multiple contacts
    Map<String,Contact> contactsList = new HashMap<>();
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
        //creating a contact with the user input
        contact = new Contact(name, address, city, state, email, phoneNumber, zipCode);
        //adding the contact in to the map using contact name as key and value as contact object
        contactsList.put(contact.name, contact);
    }

    /**
     * this method is to edit the existing contact
     */
    public void editingContact() {
        //using the scanner class taking the input from user to edit contact
        System.out.println("Enter the Name of contact to Edit");
        //taking the name from the user
        String name1 = sc.next();
            //checking the condition if the name is in  contactslist
        if (contactsList.containsKey(name1)) {
            //assigning the that key to the editcontact
            Contact editContact = contactsList.get(name1);
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
                    editContact.name = sc.next();       //changes the name to user defined name
                    break;
                }
                    case 2: {
                        System.out.println("Enter new address");
                        editContact.address = sc.next();           //changes the address by user defined address
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the new city");
                        editContact.city = sc.next();
                        break;
                    }
                    case 4: {
                        System.out.println("Enter the new state");
                        editContact.state = sc.next();         //Changes the state
                        break;
                    }
                    case 5: {
                        System.out.println("Enter the new email");
                        editContact.email = sc.next();        //Changes the email
                        break;
                    }
                    case 6: {
                        System.out.println("Enter the new phoneNumber");
                        editContact.phoneNumber = sc.nextLong();     //changes the phone number
                        break;
                    }
                    case 7: {
                        System.out.println("Enter the new Zipcode");
                        editContact.zipCode = sc.nextLong();         //changes the zipCode
                        break;
                    }
                    default:
                        break;
                }
                System.out.println("After Editing the contact");
                //  To print the contact after Editing
                System.out.println(editContact.name + " " + editContact.state + " " + editContact.address + " "
                        + editContact.city + " " + editContact.email + " " + editContact.phoneNumber +
                        " " + editContact.zipCode);
        }
    }
    public void deleteContact(){
        //printing the statement that user to enter the name
        System.out.println("Enter the name that you want to delete");
        //defining the user input to lacal variable
        String name2 = sc.next();
        //checking the name exists in the contactsList
        if (contactsList.containsKey(name2)){
            //it will remove the contact using that key
            contactsList.remove(name2);
        }

    }
    public void printContactsList(){
        System.out.println(contactsList);
    }
}
