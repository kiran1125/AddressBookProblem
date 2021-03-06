package com.bridgelabz;

import java.util.*;
import java.util.stream.Collectors;

public class MultipleAddressBook {
    //collection to store the addressBook
    Map<String, AddressBook> multipleAddressBook = new HashMap<>();
    //using scanner class to take input from the User
    Scanner sc = new Scanner(System.in);
    List<Contact> cityList = new ArrayList<>();
    /**
     * this method is to add addressBook to the multipleAddressBook
     */
    public void addingContactInAddressBook() {
        System.out.println("Enter the AddressBook Name");
        //assigning the user input to the abName to check whether its in the book
        String abName = sc.next();
        //if given name is present in the multipleAddressBook it will add the contact in that addressbook
        if (multipleAddressBook.containsKey(abName)) {
            //if the above condition satisfies then we will get that addressbook
            AddressBook addressBook = multipleAddressBook.get(abName);
            //add that contact into that address book
            addressBook.addingContact();
            //after adding we will put that again in the multiple address book
            multipleAddressBook.put(abName, addressBook);
        }
        //if given is not there in the book
        else {
            //create a new addressBook
            AddressBook addressBook = new AddressBook();
            //add the contact
            addressBook.addingContact();
            //put that address book in to the multipleAddressBook
            multipleAddressBook.put(abName, addressBook);
        }
    }

    public void editingContactInAddressBook() {
        System.out.println("Enter the AddressBook Name");
        //assigning the user input to the abName to check whether its in the book
        String abName = sc.next();
        //if given name is present in the multipleAddressBook it will add the contact in that addressbook
        if (multipleAddressBook.containsKey(abName)) {
            //if the above condition satisfies then we will get that addressbook
            AddressBook addressBook = multipleAddressBook.get(abName);
            //add that contact into that address book
            addressBook.editingContact();
            //after adding we will put that again in the multiple address book
            multipleAddressBook.put(abName, addressBook);
        }
        //if given is not there in the book
        else {
            System.out.println("Entered name doesn't exist");
        }
    }
    public void deleteContactInAddressBook(){
        System.out.println("Enter the AddressBook Name");
        //assigning the user input to the abName to check whether its in the book
        String abName = sc.next();
        //if given name is present in the multipleAddressBook it will add the contact in that addressbook
        if (multipleAddressBook.containsKey(abName)) {
            //if the above condition satisfies then we will get that addressbook
            AddressBook addressBook = multipleAddressBook.get(abName);
            //add that contact into that address book
            addressBook.deleteContact();
        }
    }
    public void searchContactUsingCity(){
        //printing the statement
        System.out.println("Enter the name of the city that want to search");
        //assigning the user input to the searchCity variable
        String searchCity = sc.next();
        //search through the multiple AddressBook
        multipleAddressBook.forEach((k,v) -> {
            v.contactsList.forEach((x,y) -> {
                if (y.city.equals(searchCity)){
                   cityList.add(y);
                }
            });
        });
    }
    public int countOfContactsByCity(){
        int count = cityList.size();
        return count;
    }
}
