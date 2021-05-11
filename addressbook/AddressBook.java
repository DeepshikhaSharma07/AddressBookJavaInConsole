package com.tts.addressbook;


// this will have all the methods

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook{

    // creating a private instance of ArrayList using Entry as it's elements.
    private ArrayList<AddressField> addressFieldBook = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public void addAddress() {
        System.out.println("First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Phone Number: ");
        String phone = scanner.nextLine();
        System.out.println("Email Address: ");
        String email = scanner.nextLine();
        AddressField addressField = new AddressField(firstName,lastName,email,phone);
        this.addressFieldBook.add(addressField);
        System.out.println("Added new entry!");
    }

    public void removeAddress() {
        System.out.println("Enter an entry's email to remove: ");
        String email = scanner.nextLine();
        boolean removedAddress = false;
        int i = 0;
        for (AddressField addressField : this.addressFieldBook) {
            if (addressField.getEmailId().equalsIgnoreCase(email)) {
                System.out.println("Deleted the following entry: \n");
                addressField.printAddress();
                this.addressFieldBook.remove(i);
                removedAddress = true;
            }
            i++;
        }
        if (!removedAddress) {
            System.out.println("No address found with that record.");
        }


        }


    public void searchAddress() {
        boolean found = false;
        if (!this.addressFieldBook.isEmpty()) {
            System.out.println("1) First Name\n" +
                    "2) Last Name\n" +
                    "3) Phone Number\n" +
                    "4) Email Address");
            System.out.println("Chose a search type: ");
            int searchType = scanner.nextInt();
            System.out.println("Enter your search: ");
            String searchQuery = scanner.next();
            switch (searchType) {
                case 1:
                    for (AddressField addressField : this.addressFieldBook) {
                        if (addressField.getFirstName().equalsIgnoreCase(searchQuery)) {
                            found = true;
                            addressField.printAddress();
                        }
                    }
                    break;
                case 2:
                    for (AddressField addressField : this.addressFieldBook) {
                        if (addressField.getLastName().equalsIgnoreCase(searchQuery)) {
                            found = true;
                            addressField.printAddress();
                        }
                    }
                    break;
                case 3:
                    for (AddressField addressField : this.addressFieldBook) {
                        if (addressField.getPhoneNumber().equalsIgnoreCase(searchQuery)) {
                            found = true;
                            addressField.printAddress();
                        }
                    }
                    break;
                case 4:
                    for (AddressField addressField : this.addressFieldBook) {
                        if (addressField.getEmailId().equalsIgnoreCase(searchQuery)) {
                            found = true;
                            addressField.printAddress();
                        }
                    }
                    break;
                default:
                    System.out.println("Sorry! Invalid input. Please try again............");
                    searchAddress();
                    break;
            }
        } else {
            System.out.println("This Address Book is empty.");
        }
        if (!found) {
            System.out.println("Did not find record with that entry.");
        }



    }

    public void printAddresses() {

        for (AddressField addressField : this.addressFieldBook)
            addressField.printAddress();
     // add validation
    }

    public void deleteAddresses() {
        this.addressFieldBook.clear();
        System.out.println("Address book cleared!");
        // add validation

    }
}

